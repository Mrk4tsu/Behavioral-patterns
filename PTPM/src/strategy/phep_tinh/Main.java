package strategy.phep_tinh;

public class Main {
    public static void main(String[] args) {
        ITinh cong = new Cong();
        ITinh tru = new Tru();

        ITinh ketQua = new Contexts();

        ((Contexts)ketQua).setTinhToan(cong);
        float num1 = 11;
        float num2 = 22;

        System.out.println(ketQua.tinh(num1, num2));
    }

}
