package iterator;

public class MonHoc {
    String tenMonHoc;
    int soTC;

    public MonHoc(String tenMonHoc, int soTC) {
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "Môn học: " + tenMonHoc + "\n" + "Số tín chỉ: " + soTC;
    }
}
