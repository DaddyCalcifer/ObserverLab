package Observer;

public interface Subject {
    //List<IObserver> observers = new ArrayList<>();
    public void notifyAllObserver();
    public void attach(Observer obs);
    public void detach(Observer obs);
}
