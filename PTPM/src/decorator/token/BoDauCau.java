package decorator.token;

import java.util.Arrays;
import java.util.List;

public class BoDauCau extends TokenDecorator{
    List<Character> list = Arrays.asList('.', ';', ',', ':');

    public BoDauCau(ITokenize tokenize) {
        super(tokenize);
    }

    @Override
    public String[] toKenize() {
        String[] str = super.toKenize();
        for (int i = 0; i < str.length; i++) {
            if (list.contains(str[i].toCharArray()[str[i].length() - 1])) {
                str[i] = str[i].substring(0, str[i].length() - 1);
            }
        }
        return str;
    }
}
