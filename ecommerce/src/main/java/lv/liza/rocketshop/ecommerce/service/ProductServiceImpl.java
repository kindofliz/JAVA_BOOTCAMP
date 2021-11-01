package lv.liza.rocketshop.ecommerce.service;

import lv.liza.rocketshop.ecommerce.repository.Product;
import lv.liza.rocketshop.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService  {

    // productRepository constructor injection
    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();

    }

    @Override
    public Product getProduct(long id) throws Exception {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);

    }
}

