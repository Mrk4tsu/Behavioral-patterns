package observer.console;

public abstract class MyButton {
    abstract void attach(IActionListener listener);
    abstract void detach();
    abstract void click();
}
