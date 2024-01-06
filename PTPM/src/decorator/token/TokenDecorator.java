package decorator.token;

public class TokenDecorator implements ITokenize{
    ITokenize tokenize;
    public TokenDecorator(ITokenize tokenize) {
        this.tokenize = tokenize;
    }
    @Override
    public String[] toKenize() {
        return tokenize.toKenize();
    }
}
