package observer.nha_dau_tu;

public class ConcreteObserverNhaDauTuB implements IObserver{
    SubjectTriGia subject;

    public ConcreteObserverNhaDauTuB(SubjectTriGia subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void build(){
        this.subject.attach(this);
    }
    public void destroy(){
        this.subject.detach(this);
    }

    @Override
    public void update(float data) {
        if (data < 0){
            System.out.println("Đối tượng B: Nhận dữ liệu. Nhập dữ liệu.");
        }
        else
            System.out.println("Đối tượng B: Nhận dữ liệu. Xuất dữ liệu.");
    }
}
