package observer.nha_dau_tu;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectTriGia extends SubjectTriGia {
    List<IObserver> observers = new ArrayList<>();

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
    void mNotify(float data) {
        for(IObserver o : observers){
            o.update(data);
        }
    }
}
