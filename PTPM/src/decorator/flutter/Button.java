package decorator.flutter;

public class Button extends WidgetDecorator{
    public Button(Widget child) {
        super(child);
    }
    @Override
    public void show() {
        System.out.println("Button");
        childern.show();
        System.out.println("</Button>");
    }
}
