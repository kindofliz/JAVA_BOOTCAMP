package lv.liza.rocketshop.ecommerce.service;

import lv.liza.rocketshop.ecommerce.repository.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id) throws Exception;

    Product save(Product product);
}
