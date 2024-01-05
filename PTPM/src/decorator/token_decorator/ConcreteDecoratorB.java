package decorator.token_decorator;

import java.util.Arrays;
import java.util.List;

public class ConcreteDecoratorB extends Decorator{
    List<Character> list = Arrays.asList('.', ';', ',', ':','!');
    public ConcreteDecoratorB(IConponent conponent) {
        super(conponent);
    }

    @Override
    public String[] Operation() {
        String[] str = super.Operation();
        for (int i = 0; i < str.length; i++) {
            if (list.contains(str[i].toCharArray()[str[i].length() - 1])) {
                str[i] = str[i].substring(0, str[i].length() - 1);
            }
        }
        return str;
    }
}
