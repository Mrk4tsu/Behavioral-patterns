package decorator.token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoTu extends TokenDecorator{
    List<String> list = Arrays.asList("và", "hoặc", "thì", "mà", "là");

    public BoTu(ITokenize tokenize, List<String> list) {
        super(tokenize);
    }
    public BoTu(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public String[] toKenize() {
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.toKenize()));
        dsTu.removeAll(list);
        return dsTu.toArray(new String[0]);
    }
}
