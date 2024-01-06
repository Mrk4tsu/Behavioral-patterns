package strategy.thanh_toan_gio_hang;

public class TienGiamThanhToan implements ITienGiamThanhToan{
    @Override
    public float tienThanhToan(float tong) {
        if (tong >= 1000000 && tong <= 2000000)
            return 0.02f;
        return 0.03f;
    }
}
