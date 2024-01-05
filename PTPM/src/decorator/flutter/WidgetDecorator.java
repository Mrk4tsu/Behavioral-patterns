package decorator.flutter;

public class WidgetDecorator implements Widget{
    Widget childern;

    public WidgetDecorator(Widget childern) {
        this.childern = childern;
    }

    @Override
    public void show() {

    }
}
