package chain_of_resposibility.vay_tien;

/**
 * Các cấp nhỏ hơn cấp cao nhất
 * Nơi đây sẽ có 1 successor để xử lý
 */
public class ConcreteHandler2 implements IHandle{
    IHandle successor;

    //Các thuộc tính thêm
    String tenNV,chucVu;
    int hanMucVay;

    public ConcreteHandler2(String tenNV, String chucVu, int hanMucVay) {
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IHandle SetSuccessor(IHandle successor) {
        this.successor = successor;
        return successor;
    }

    @Override
    public String HandleRequest(int tien) {
        if (tien <= hanMucVay){
            return chucVu + " " + tenNV + " xử lý cho vay";
        }
        return successor.HandleRequest(tien);
    }
}
