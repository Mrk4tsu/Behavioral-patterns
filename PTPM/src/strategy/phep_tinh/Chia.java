package strategy.phep_tinh;

public class Chia implements ITinh{
    @Override
    public float tinh(float a, float b) {
        return a / b;
    }
}
