package observer.data_binding;

import java.util.ArrayList;
import java.util.List;

public class MyStream <T>{
    private List<IStreamListener<T>> listeners = new ArrayList<>();
    public void addListener(IStreamListener<T> listener) {
        if (!listeners.contains(listener))
            listeners.add(listener);
    }

    public void addEvent(T t) {
        for (IStreamListener listener : listeners)
            listener.listen(t);
    }
}
