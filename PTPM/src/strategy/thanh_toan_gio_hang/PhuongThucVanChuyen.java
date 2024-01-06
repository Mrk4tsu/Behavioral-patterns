package strategy.thanh_toan_gio_hang;

public class PhuongThucVanChuyen implements IPhuongThucVanChuyen {

    @Override
    public int soNgay(TypeVanChuyen vanChuyen) {
        int soNgay = 0;
        if (vanChuyen == TypeVanChuyen.NINJA_VAN) {
            return 5;
        }
        return 4;
    }
}
