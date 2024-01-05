package observer.console;

public class ConcreateObserverActivity implements IActionListener{
    int count = 0;
    MyButton myButton;

    public ConcreateObserverActivity(MyButton myButton) {
        this.myButton = myButton;
        this.myButton.attach(this);
    }
    public void destroy(){
        this.myButton.detach();
    }
    public void build(){
        this.myButton.attach(this);
    }
    @Override
    public void onclick() {
        count++;
        System.out.println("Số lần bấm: " + count);
    }
}
