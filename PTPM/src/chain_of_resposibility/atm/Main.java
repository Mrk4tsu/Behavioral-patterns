package chain_of_resposibility.atm;

public class Main {
    public static void main(String[] args) {
        IHandle m500 = new MenhGia(500);
        IHandle m100 = new MenhGia(100);
        IHandle m50 = new MenhGia(50);
        IHandle m10 = new MenhGia(10);
        IHandle m1 = new MenhGia(1);

        System.out.println("Câu a:");
        m500.SetSuccessor(m100).SetSuccessor(m50).SetSuccessor(m10).SetSuccessor(m1);
        m500.HandleRequest(293);

        System.out.println("Câu b:");
        ATMFactory factory = new ATMFactory();
        factory.getATM(10).HandleRequest(293);
    }
}
