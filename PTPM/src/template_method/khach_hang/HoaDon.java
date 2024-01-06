package template_method.khach_hang;


import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<HangHoa> dsHangHoa = new ArrayList<>();

    protected abstract float tinhChietKhau(float tongSoTien);

    public float tinhTien() {
        float tong = 0;
        for (HangHoa hangHoa : dsHangHoa) {
            tong = hangHoa.soLuong * hangHoa.donGia;
        }
        return tong;
    }

    public void hienThi() {
        System.out.println("Sản phẩm trong giỏ: ");
        for (HangHoa hangHoa : dsHangHoa) {
            System.out.println(hangHoa.toString());
        }
        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khẩu: " + tinhChietKhau(tinhTien()));
        System.out.println("Tiền phải trả: " + (tinhTien() - tinhChietKhau(tinhTien())));
    }
}
