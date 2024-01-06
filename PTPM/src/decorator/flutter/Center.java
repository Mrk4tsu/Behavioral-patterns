package decorator.flutter;

public class Center extends WidgetDecorator{
    public Center(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("Center");
        childern.show();
        System.out.println("</center>");
    }
}
