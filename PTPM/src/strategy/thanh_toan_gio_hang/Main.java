package strategy.thanh_toan_gio_hang;

public class Main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        //Thêm MH

        gioHang.themMatHang(new Mathang("Đồ chơi người lớn", 3, 5000));
        gioHang.themMatHang(new Mathang("Đồ chơi trẻ em", 3, 5000));
        gioHang.themMatHang(new Mathang("Đồ chơi thanh niên", 3, 5000));
        gioHang.setThanhToan(new TienGiamThanhToan());
        gioHang.setVanChuyen(new PhuongThucVanChuyen());
        gioHang.setKhuyenMai(new KhuyenMai10Max100());
        gioHang.thanhToan();
    }
}
