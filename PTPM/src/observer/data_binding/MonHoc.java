package observer.data_binding;

public class MonHoc {
    String maMH, tenMH;
    int soTc;

    public MonHoc(String maMH, String tenMH, int soTc) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTc = soTc;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTc() {
        return soTc;
    }

    public void setSoTc(int soTc) {
        this.soTc = soTc;
    }

    @Override
    public String toString() {
        return "Mã môn học: " + maMH +
                "\nTên môn học: " + tenMH +
                "\nSố tín chỉ: " + soTc +
                "\n--------------------------------------------------------------";
    }
}
