package chain_of_resposibility.atm;

public class MenhGia implements IHandle{
    IHandle successor;
    int menhGiaTien;

    public MenhGia(int menhGiaTien) {
        this.menhGiaTien = menhGiaTien;
    }

    @Override
    public IHandle SetSuccessor(IHandle successor) {
        this.successor = successor;
        return successor;
    }

    @Override
    public String HandleRequest(int soTien) {
        int soTo = soTien/menhGiaTien;
        int soDu = soTien%menhGiaTien;
        if (soTo>0) System.out.println(soTo + " tờ mệnh giá " + menhGiaTien);
        if (soDu>0 && successor != null) successor.HandleRequest(soDu);
        return null;
    }
}
