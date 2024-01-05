package observer.nha_dau_tu;

public class ConcreteObserverA implements IObserver {
    Subject subject;

    /**
     * Constructor tạo mới 1 đối tượng nhận thông báo
     *
     * @param subject subject.attach(this); khi khởi tạo sẽ tự động thêm vào danh sách nhận thông báo
     *                vì đã implements IObserver thì chỉ cần truyền this vào là được.
     */
    public ConcreteObserverA(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    public void build(){
        this.subject.attach(this);
    }
    /**
     * Phương thức xóa đối tượng ra khỏi danh sách object nhận thông báo
     */
    public void destroy() {
        subject.detach(this);
    }

    @Override
    public void update(float data) {
        if (data > 0){
            System.out.println("Đối tượng A: Nhận dữ liệu. Nhập dữ liệu.");
        }
        else
            System.out.println("Đối tượng A: Nhận dữ liệu. Xuất dữ liệu.");
    }
}
