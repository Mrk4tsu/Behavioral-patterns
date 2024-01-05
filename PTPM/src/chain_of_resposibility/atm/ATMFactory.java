package chain_of_resposibility.atm;

public class ATMFactory {
    IHandle menhGia100 = new MenhGia(100);
    IHandle menhGia50 = new MenhGia(50);
    IHandle menhGia10 = new MenhGia(10);
    IHandle menhGia1 = new MenhGia(1);

    public ATMFactory() {
        menhGia100.SetSuccessor(menhGia50).SetSuccessor(menhGia10).SetSuccessor(menhGia1);
    }

    IHandle getATM(int menhGia) {
        switch (menhGia) {
            case 100:
                return menhGia100;
            case 50:
                return menhGia50;
            case 10:
                return menhGia10;
            case 1:
                return menhGia1;
        }
        return menhGia100;
    }
}
