package Iniciante.funcional.function.util;

import Iniciante.funcional.consumer.entities.Product;
import java.util.function.Consumer;
import java.util.function.Function;

public class UpperCaseName implements Function<Product,String> {

    /**
     * Applies this function to the given argument.
     *
     * @param product the function argument
     * @return the function result
     */
    @Override
    public String apply(Product product) {
        return product.toString().toUpperCase();
    }
}
