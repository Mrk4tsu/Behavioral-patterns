package chain_of_resposibility.tien_dien;

public interface IHandle {
    IHandle SetSuccessor(IHandle successor);
    String HandleRequest(int kWh);
}
