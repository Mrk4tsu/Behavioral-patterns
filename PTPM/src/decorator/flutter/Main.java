package decorator.flutter;

public class Main {
    public static void main(String[] args) {
        Widget text = new Text("Tôi là con người");
        text = new Button(text);
        Widget anchor = new Center(text);
        anchor.show();
    }
}
