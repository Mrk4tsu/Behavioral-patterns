package template_method.sort;

public class SortByPrice extends SortCollection<Product>{
    @Override
    protected int myCompare(Product t1, Product t2) {
        if (t1.price > t2.price)
            return 1;
        if (t1.price < t2.price)
            return -1;
        return 0;
    }
}
