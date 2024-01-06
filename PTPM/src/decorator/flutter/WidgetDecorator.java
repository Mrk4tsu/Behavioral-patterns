package decorator.flutter;

public class WidgetDecorator implements Widget{
    public Widget childern;

    public WidgetDecorator(Widget childern) {
        this.childern = childern;
    }

    @Override
    public void show() {

    }
}
