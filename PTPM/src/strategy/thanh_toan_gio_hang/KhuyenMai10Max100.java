package strategy.thanh_toan_gio_hang;

public class KhuyenMai10Max100 implements IKhuyenMai{
    @Override
    public float khuyenMai(float tong) {
        float tienKM = tong * 0.1f;
        return tienKM < 100 ? tienKM : 100;
    }
}
