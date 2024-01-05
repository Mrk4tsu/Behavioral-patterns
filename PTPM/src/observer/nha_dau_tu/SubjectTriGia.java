package observer.nha_dau_tu;

public abstract class SubjectTriGia {
    abstract void attach(IObserver observer);
    abstract void detach(IObserver observer);
    abstract void mNotify(float data);
}
