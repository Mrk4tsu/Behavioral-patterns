package chain_of_resposibility.do_ve_so;

public class Main {
    public static void main(String[] args) {
        IHandle giaiDB = new GiaiThuong("Giải Đặc Biệt", new String[]{"249660"});
        IHandle giaiNhat = new GiaiThuong("Giải Nhất", new String[]{"36268"});
        IHandle giaiNhi = new GiaiThuong("Giải Nhì", new String[]{"51090"});
        IHandle giaiBa = new GiaiThuong("Giải Ba", new String[]{"50532", "32381"});
        IHandle giaiTu = new GiaiThuong("Giải Tư", new String[]{"03514", "88419", "17221", "78331", "87167", "61796", "66330"});
        IHandle giaiNam = new GiaiThuong("Giải Năm", new String[]{"2195"});
        IHandle giaiSau = new GiaiThuong("Giải Sáu", new String[]{"3585", "7370", "4062"});
        IHandle giaiBay = new GiaiThuong("Giải Bảy", new String[]{"255"});
        IHandle giaiTam = new GiaiSauCung("Giải Tám", new String[]{"85"});
        IHandle giaiKK= new GiaiKhuyenKhich("Giải Khuyến Khích", "249660");

        giaiDB.giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiNam)
                .giaiKeTiep(giaiSau)
                .giaiKeTiep(giaiBay)
                .giaiKeTiep(giaiTam)
                .giaiKeTiep(giaiKK);

        String[] veSoResults = {"249650", "255678", "651265", "85"};

        for (String veSo : veSoResults) {
            String ketQua = giaiDB.TrungGiai(veSo);
            System.out.println(ketQua);
        }
    }
}
