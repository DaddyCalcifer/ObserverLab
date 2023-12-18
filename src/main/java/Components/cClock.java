package Components;

import javafx.scene.text.Text;
import Observer.Observer;

import java.util.Calendar;
import java.util.Date;

public class cClock implements Observer {
    private final Text text;
    Integer secs = 0;
    public cClock()
    {
        text = new Text();
        text.setStyle("-fx-font: 24 arial;");
    }
    @Override
    public void update(Date date) {
        text.setText("Прошло: " + (secs++) + " секунд");
    }

    public Text getClock(){
        return this.text;
    }
}
