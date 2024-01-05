package decorator.token_decorator;

import java.util.Arrays;

public class Main {
    public static void hienThi(String[] str) {
        Arrays.stream(str).forEach(s -> {
            System.out.println(s);
        });
    }

    public static void main(String[] args) {
        IConponent conponent = new ConcreteComponent("Hôm nay trời mưa và tôi xin nghỉ học, thật tuyệt vời!");
        hienThi(conponent.Operation());

        System.out.println("--------------\n" + "Tách dấu: ");
        IConponent iConponent = new ConcreteDecoratorB(conponent);
        hienThi(iConponent.Operation());

        System.out.println("---------------\n" + "Tách từ dừng: ");
        IConponent boTu = new ConcreteDecoratorA(conponent);
        hienThi(boTu.Operation());
    }
}
