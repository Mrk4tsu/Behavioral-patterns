package chain_of_resposibility.do_ve_so;

public class GiaiSauCung implements IHandle{
    IHandle giaiKeTiep;
    String tenGiai;
    String[] boSoTrungThuong;

    public GiaiSauCung(String tenGiai, String[] boSoTrungThuong) {
        this.tenGiai = tenGiai;
        this.boSoTrungThuong = boSoTrungThuong;
    }

    @Override
    public IHandle giaiKeTiep(IHandle successor) {
        this.giaiKeTiep = successor;
        return giaiKeTiep;
    }

    @Override
    public String TrungGiai(String veSo) {
        for (String boSo : boSoTrungThuong) {
            if (veSo.endsWith(boSo)) {
                return "Chúc mừng, bạn đã trúng giải " + tenGiai + " với số: " + veSo;
            }
        }
        if (giaiKeTiep != null) {
            return giaiKeTiep.TrungGiai(veSo);
        }
        return "Chúc may mắn lần sau!";
    }
}
