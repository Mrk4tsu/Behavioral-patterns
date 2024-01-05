package chain_of_resposibility.vay_tien;

public interface IHandle {
    IHandle SetSuccessor(IHandle successor);
    String HandleRequest(int tien);
}
