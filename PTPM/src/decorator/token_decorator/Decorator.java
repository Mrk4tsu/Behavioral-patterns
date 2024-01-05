package decorator.token_decorator;

public class Decorator implements IConponent{
    IConponent conponent;

    public Decorator(IConponent conponent) {
        this.conponent = conponent;
    }

    @Override
    public String[] Operation() {
        return conponent.Operation();
    }
}
