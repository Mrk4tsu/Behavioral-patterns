package chain_of_resposibility.vay_tien;

/**
 * Đây sẽ là lớp request xử lý cấp cao nhất
 */
public class ConcreteHandler1 implements IHandle{
    String ten;
    int hanMucVay;

    public ConcreteHandler1(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    /**
     * Vì đây là lớp xử lý cấp cao nhất nên sẽ không có cấp nào cao hơn để xử lý
     * @param successor
     * @return null biểu thị đây là cấp cao nhất
     */
    @Override
    public IHandle SetSuccessor(IHandle successor) {
        return null;
    }

    @Override
    public String HandleRequest(int tien) {
        if (tien < hanMucVay){
            return "Giám đốc (Cấp cao nhất) xử lý cho vay";
        }
        else
            return "Không thể xử lý khoản vay!";
    }
}
