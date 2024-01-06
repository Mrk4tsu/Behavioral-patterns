package decorator.token;

import java.util.Arrays;

public class Main {
    public static void hienThi(String[] str){
        Arrays.stream(str).forEach(s -> {
            System.out.println(s);
        });
    }
    public static void main(String[] args) {
        ITokenize tokenize = new TachTu("Hôm nay hoặc ngày mai, tôi đến lớp và học bài mới");

        hienThi(tokenize.toKenize());

        System.out.println("--------------\n" + "Tách dấu: ");
        ITokenize boDau = new BoDauCau(tokenize);
        hienThi(boDau.toKenize());
        System.out.println("---------------\n" + "Tách từ dừng: ");
        ITokenize boTu = new BoTu(tokenize);
        hienThi(boTu.toKenize());
    }
}
