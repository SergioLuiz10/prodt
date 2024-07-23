package prd;

import java.util.function.Predicate;

public class predica implements Predicate<produto> {

    @Override
    public boolean test(produto produto) {
        return produto.getPrice()<=100.00;
    }
}
