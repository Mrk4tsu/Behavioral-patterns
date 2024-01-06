package template_method.sort;

public class SortByName extends SortCollection<Product>{

    @Override
    protected int myCompare(Product t1, Product t2) {
        return t1.name.compareTo(t2.name);
    }
}
