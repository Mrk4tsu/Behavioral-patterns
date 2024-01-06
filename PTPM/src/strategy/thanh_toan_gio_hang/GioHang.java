package strategy.thanh_toan_gio_hang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    List<Mathang> mathangList = new ArrayList<>();
    IKhuyenMai khuyenMai;
    ITienGiamThanhToan thanhToan;
    IPhuongThucVanChuyen vanChuyen;
    TypeVanChuyen vanChuyenType;
    public void themMatHang(Mathang mathang){
        mathangList.add(mathang);
    }
    public void thanhToan(){
        int tong = 0;
        for (Mathang mathang : mathangList){
            tong += mathang.soLuong * mathang.donGia;
        }
        float tienKM = khuyenMai.khuyenMai(tong);
        float kmThanhToan = thanhToan.tienThanhToan(tong - tienKM);

        System.out.println("Tổng tiền phải thanh toán: " + tong);
        System.out.println("Tiền giảm khuyến mại: " + tienKM);
        System.out.println("Tiền giảm thanh toán: " + kmThanhToan);
        System.out.println("Tiền phải trả: " + (tong - tienKM - kmThanhToan));
        System.out.println("Bạn sẽ nhận được hàng sau: " + vanChuyen.soNgay(vanChuyenType));
    }
    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void setThanhToan(ITienGiamThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(IPhuongThucVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }
}
