package chain_of_resposibility.vay_tien;

public class Main {
    //Set up các level xử lý
    public static void main(String[] args) {
        IHandle baoVe = new ConcreteHandler2("A", "Bảo vệ", 1000000);
        IHandle nhanVien = new ConcreteHandler2("B", "Nhân viên", 5000000);
        IHandle truongPhong = new ConcreteHandler2("C", "Trưởng phòng", 20000000);
        IHandle giamDoc = new ConcreteHandler1("A",  50000000);
        baoVe.SetSuccessor(nhanVien).SetSuccessor(truongPhong).SetSuccessor(giamDoc);

        System.out.println(baoVe.HandleRequest(600000));
    }
}
