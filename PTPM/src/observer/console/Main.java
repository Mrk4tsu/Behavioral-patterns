package observer.console;

public class Main {
    public static void main(String[] args) {
        ConcreateSubjectButton button = new ConcreateSubjectButton();
        ConcreateObserverActivity activity = new ConcreateObserverActivity(button);
        System.out.println("Lần 1:");
        button.click();
        button.click();
        button.click();

        //Bỏ activity
        System.out.println("Lần 2:");
        activity.destroy();
        button.click();
        button.click();

        //Thêm lại activity
        System.out.println("Lần 3:");
        activity.build();
        button.click();
        button.click();
    }
}
