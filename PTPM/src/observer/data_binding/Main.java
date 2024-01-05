package observer.data_binding;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> myStream = new MyStream<>();
        MyClient myClient = new MyClient(myStream);

        DataAccess dataAccess = new DataAccess(myStream);
        dataAccess.add(new MonHoc("001", "Lịch sử Đảng", 3));
        dataAccess.add(new MonHoc("002", "Pháp luật đại cương", 1));
        dataAccess.add(new MonHoc("003", "Toán rời rạc", 3));
        dataAccess.add(new MonHoc("004", "Xác xuất thống kê", 3));
        
        dataAccess.remove("002");
        dataAccess.remove("004");
    }
}
