package chain_of_resposibility.tien_dien;

public class ConcreteHandler2 implements IHandle {
    IHandle successor;
    int mucSuDung;
    float giaBanDien;

    public ConcreteHandler2(int mucSuDung, float giaBanDien) {
        this.mucSuDung = mucSuDung;
        this.giaBanDien = giaBanDien;
    }

    @Override
    public IHandle SetSuccessor(IHandle successor) {
        this.successor = successor;
        return successor;
    }

    @Override
    public String HandleRequest(int kWh) {
        if (kWh <= mucSuDung){
            return "Số kWh sử dụng: " + kWh + " thuộc nhóm " + giaBanDien + "\n" + "Tổng tiền điện: "
                    + (kWh * giaBanDien);
        }
        return successor.HandleRequest(kWh);
    }
}
