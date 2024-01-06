package decorator.token;

public class TachTu implements ITokenize{
    String str;

    public TachTu(String str) {
        this.str = str;
    }

    @Override
    public String[] toKenize() {
        return str.split(" ");
    }
}
