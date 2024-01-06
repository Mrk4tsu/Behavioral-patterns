package template_method.khach_hang;

public class HoaDonKhachHangVang extends HoaDon{

    @Override
    protected float tinhChietKhau(float tongSoTien) {
        if (tongSoTien >= 500000)
            return 0.03f;
        else if (tongSoTien >= 1000000) {
            return 0.05f;
        }
        return 0;
    }
}
