package Components;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import Observer.Observer;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;

public class cMedia implements Observer {
    private final MediaPlayer mediaPlayer;
    private final MediaView mediaView;
    int start_delay = 5;
    public cMedia() throws MalformedURLException {
        String url = new File("src//main//resources//media//vid.mp4").toURI().toURL().toString();

        mediaPlayer = new MediaPlayer(new Media(url));
        mediaPlayer.setAutoPlay(false);
        mediaPlayer.setVolume(0.2);
        //mediaPlayer.play();
        mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(700); mediaView.setFitHeight(700);
    }

    public MediaView getMediaView(){ return this.mediaView;}

    @Override
    public void update(Date date) {
        this.mediaPlayer.setVolume(this.mediaPlayer.getVolume()*0.85);
        System.out.println("Громкость: " + this.mediaPlayer.getVolume()*100 + "%");
        if (start_delay  == 0){
            this.mediaPlayer.play();
            System.out.println("Воспроизвденеие включено.");
        }
        else {
            System.out.println("До воспроизведения осталось: " + (start_delay--));
        }
    }
}
