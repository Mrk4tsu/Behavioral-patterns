package chain_of_resposibility.atm;

public interface IHandle {
    IHandle SetSuccessor(IHandle successor);
    String HandleRequest(int soTien);
}
