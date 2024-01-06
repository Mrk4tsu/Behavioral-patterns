package strategy.phep_tinh;

public class Cong implements ITinh{
    @Override
    public float tinh(float a, float b) {
        return a + b;
    }
}
