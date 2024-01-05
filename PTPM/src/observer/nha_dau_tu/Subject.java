package observer.nha_dau_tu;

public abstract class Subject {
    abstract void attach(IObserver observer);
    abstract void detach(IObserver observer);
    abstract void mNotify(float data);
}
