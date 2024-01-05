package iterator;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static void inDS(@NotNull Iterator<MonHoc> monHocIterator) {
        while (monHocIterator.hasNext()) {
            MonHoc monHoc = monHocIterator.next();
            System.out.println(monHoc.toString());
        }
    }
    /**
     * Phương thức duyệt danh sách để sau khi duyệt danh sách
     * sẽ cho người dùng tự định nghĩa thao tác với danh sách
     * @param iterator
     * @param consumer
     */
    static void duyetDS(@NotNull Iterator<MonHoc> iterator, Consumer<MonHoc> consumer) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            consumer.accept(monHoc);
        }
    }
    public static void main(String[] args) {
        List<MonHoc> monHocs = new ArrayList<>();
        monHocs.add(new MonHoc("Toán Cao Cấp", 3));
        monHocs.add(new MonHoc("Cấu trúc dữ liệu", 3));
        monHocs.add(new MonHoc("Tiếng Anh", 3));
        monHocs.add(new MonHoc("Giao diện web", 3));
        //Cách 1:
        Iterator<MonHoc> monHocIterator = monHocs.iterator();
        while (monHocIterator.hasNext()) {
            System.out.println(monHocIterator.next());
        }
        System.out.println("----------------------------------");

        //Cách 2:
        inDS(monHocs.iterator());
        System.out.println("----------------------------------");
        //Cách 3:
        duyetDS(monHocs.iterator(), new Consumer<MonHoc>() {
            @Override
            public void accept(MonHoc monHoc) {
                System.out.println(monHoc.toString());
            }
        });
    }
}
