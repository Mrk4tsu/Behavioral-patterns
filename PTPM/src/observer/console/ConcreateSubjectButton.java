package observer.console;

public class ConcreateSubjectButton extends MyButton {
    IActionListener listener;

    @Override
    void attach(IActionListener listener) {
        this.listener = listener;
    }

    @Override
    void detach() {
        this.listener = null;
    }

    @Override
    void click() {
        if (listener != null)
            listener.onclick();
    }
}
