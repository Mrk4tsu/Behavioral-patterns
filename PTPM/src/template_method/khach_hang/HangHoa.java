package template_method.khach_hang;

public class HangHoa {
    String name;
    int soLuong;
    int donGia;

    public HangHoa(String name, int soLuong, int donGia) {
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "name='" + name + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
