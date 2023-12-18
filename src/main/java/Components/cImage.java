package Components;

import ImageIterator.ConcreteAggregate;
import ImageIterator.Iterator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import Observer.Observer;

import java.util.Calendar;
import java.util.Date;

public class cImage implements Observer {
    private ImageView img;
    ConcreteAggregate conaggr;
    public Iterator iter;
    Integer secs = 0;
    public cImage()
    {
        conaggr = new ConcreteAggregate();
        iter = conaggr.getIterator();
        img = new ImageView();
    }
    @Override
    public void update(Date date) {
        img.setImage((Image)iter.next());
    }

    public ImageView getImg(){
        return this.img;
    }
}
