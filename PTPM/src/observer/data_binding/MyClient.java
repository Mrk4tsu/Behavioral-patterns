package observer.data_binding;

import java.util.List;

public class MyClient implements IStreamListener<List<MonHoc>>{
    MyStream<List<MonHoc>> myStream;
    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }
    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println("Số lượng môn học: " + monHocs.size());
        for (MonHoc m : monHocs)
            System.out.println(m.toString());
    }
}
