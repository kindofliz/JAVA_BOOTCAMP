package lv.liza.rocketshop.ecommerce.service;

import lv.liza.rocketshop.ecommerce.repository.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl {

        // productRepository constructor injection

        @Override
        public Iterable<Product> getAllProducts() {
            return productRepository.findAll();

        }

        @Override
        public Product getProduct(long id) {
            return productRepository
                    .findById(id)
                    .orElseThrow(() -> new Exception("Product not found"));
        }

        @Override
        public Product save(Product product) {
            return productRepository.save(product);

        }
    }
}
