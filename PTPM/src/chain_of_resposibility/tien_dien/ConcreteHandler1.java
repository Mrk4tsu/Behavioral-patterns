package chain_of_resposibility.tien_dien;

/**
 * Cấp cao nhất
 */
public class ConcreteHandler1 implements IHandle{
    float giaBanDien;
    int mucSuDung;
    public ConcreteHandler1() {
        this.giaBanDien = 2.927f;
        this.mucSuDung = 400;
    }

    @Override
    public IHandle SetSuccessor(IHandle successor) {
        return null;
    }

    @Override
    public String HandleRequest(int kWh) {
        if (kWh > mucSuDung)
            return "Số kWh sử dụng: " + kWh + " thuộc nhóm (cao nhất) " + giaBanDien + "\n" + "Tổng tiền điện: " + (kWh * giaBanDien);
        return "Không biết nữa";
    }
}
