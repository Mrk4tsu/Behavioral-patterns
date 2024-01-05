package chain_of_resposibility.tien_dien;

public class Main {
    public static void main(String[] args) {
        IHandle level1 = new ConcreteHandler2(50, 1.678f);
        IHandle level2 = new ConcreteHandler2(100, 1.734f);
        IHandle level3 = new ConcreteHandler2(200, 2.014f);
        IHandle level4 = new ConcreteHandler2(300, 2.536f);
        IHandle level5 = new ConcreteHandler2(400, 2.834f);
        IHandle level6 = new ConcreteHandler1();

        level1.SetSuccessor(level2)
                .SetSuccessor(level3)
                .SetSuccessor(level4)
                .SetSuccessor(level5)
                .SetSuccessor(level6);

        System.out.println(level1.HandleRequest(51));
    }
}
