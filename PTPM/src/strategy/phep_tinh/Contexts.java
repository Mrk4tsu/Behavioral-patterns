package strategy.phep_tinh;

public class Contexts implements ITinh{
    public ITinh tinhToan;

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }
}
