package decorator.token_decorator;

public class ConcreteComponent implements IConponent{
    String str;

    public ConcreteComponent(String str) {
        this.str = str;
    }
    //Xử lý cắt chuooxt thành mảng bằng việc cắt chuỗi qua từng khoảng trống
    @Override
    public String[] Operation() {
        return str.split(" ");
    }
}
