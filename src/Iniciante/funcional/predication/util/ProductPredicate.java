package Iniciante.funcional.predication.util;

import Iniciante.funcional.predication.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice()>100.0;
    }
}
