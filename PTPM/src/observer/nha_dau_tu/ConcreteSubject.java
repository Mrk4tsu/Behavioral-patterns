package observer.nha_dau_tu;

import java.util.List;

public class ConcreteSubject extends Subject {
    List<IObserver> observers;

    @Override
    void attach(IObserver observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    void detach(IObserver observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    void mNotify() {
        for(IObserver o : observers){
            o.update();
        }
    }
}
