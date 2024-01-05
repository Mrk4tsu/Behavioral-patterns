package observer.nha_dau_tu;

public class Main {
    public static void main(String[] args) {
        ConcreteSubjectTriGia subject = new ConcreteSubjectTriGia();
        ConcreteObserverNhaDauTuA a = new ConcreteObserverNhaDauTuA(subject);
        ConcreteObserverNhaDauTuB b = new ConcreteObserverNhaDauTuB(subject);

        System.out.println("Part 1:");
        subject.mNotify(6);

        //Đối tượng a sẽ bị loại bỏ khỏi ds nhận thông báo
        System.out.println("Part 2:");
        a.destroy();
        subject.mNotify(-11);

        //Sau khi a bị loại thì lần này chỉ có b sẽ hiển thị update
        System.out.println("Part 3:");
        subject.mNotify(-5);

        //Lần này thêm lại đối tượng a vào lại ds nhận thông báo
        System.out.println("Part 4:");
        a.build();
        subject.mNotify(-7);
    }
}
