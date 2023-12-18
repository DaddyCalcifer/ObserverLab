package Components;
import java.util.concurrent.ThreadLocalRandom;

import javafx.scene.text.Text;
import Observer.Observer;

import java.util.Calendar;
import java.util.Date;

public class cPhrase implements Observer {
    private final Text text;
    Integer delay = 0;
    Integer secs = 0;
    String[] phrases ={
            "Если у тебя получилось обмануть человека,\n это не значит,\n что он дурак, это значит,\n что тебе доверяли больше,\n чем ты этого заслуживаешь.",
            "Запомни одну вещь, мальчик:\n никогда, никогда и еще раз никогда ты не\n окажешься смешным в глазах женщины,\n если сделаешь что-то ради нее.",
            "Когда мне было 5 лет,\n мама всегда твердила мне,\n что самое важное в жизни — быть счастливым.\n Когда я пошел в школу,\n меня спросили, кем я хочу стать, когда вырасту.\n Я написал «счастливым».\n Мне сказали – «ты не понял задание»,\n а я ответил — «вы не поняли жизнь».",
            "Одиночество легче,\n когда не любишь.",
            "Настоящий друг — это человек,\n который выскажет тебе в глаза все,\n что о тебе думает,\n а всем скажет, что ты — замечательный человек.",
            "Родиться дураком не позор.\n А вот умереть дураком стыдно.",
            "Не всегда просит прощения тот,\n кто виноват.\n Просит прощения тот,\n кто дорожит отношениями.",
            "Ты когда-нибудь чувствовал,\n что тебе не хватает того,\n кого ты никогда не встречал?",
            "Мужество — это когда заранее знаешь,\n что ты проиграл,\n и все-таки берешься за дело и наперекор\n всему на свете идешь до конца.\n Побеждаешь очень редко,\n но иногда все-таки побеждаешь.",
            "Когда человек действительно хочет чего-то,\n вся Вселенная вступает в сговор,\n чтобы помочь этому человеку осуществить свою мечту.",
            "Не тот велик,\n кто никогда не падал,\n а тот велик — кто падал и вставал!",
            "Мы в жизни любим только раз,\n а после ищем лишь похожих."
    };

    public cPhrase()
    {
        text = new Text();
        text.setStyle("-fx-font: 24 arial;");
    }
    @Override
    public void update(Date date) {
        if(delay == 0)
        {
            text.setText(phrases[ThreadLocalRandom.current().nextInt(0, phrases.length - 1)]);
            text.setStyle("-fx-font: " + ThreadLocalRandom.current().nextInt(15,25) +" arial;");
            delay = 5;
        }
        delay--;
    }

    public Text getPhrase(){
        return this.text;
    }
}
