package observer.data_binding;

public interface IStreamListener<T> {
    void listen(T t);
}
