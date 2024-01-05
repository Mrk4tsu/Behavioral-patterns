package decorator.token_decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcreteDecoratorA extends Decorator{
    List<String> list = Arrays.asList("và", "hoặc", "thì", "mà", "là");

    public ConcreteDecoratorA(IConponent conponent, List<String> list) {
        super(conponent);
        this.list = list;
    }

    public ConcreteDecoratorA(IConponent conponent) {
        super(conponent);
    }

    @Override
    public String[] Operation() {
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.Operation()));
        dsTu.removeAll(list);
        return dsTu.toArray(new String[0]);
    }
}
