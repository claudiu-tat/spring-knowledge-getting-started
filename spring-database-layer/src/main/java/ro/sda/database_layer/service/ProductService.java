package ro.sda.database_layer.service;

import org.springframework.stereotype.Service;
import ro.sda.database_layer.model.Product;
import ro.sda.database_layer.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product p) {
        productRepository.addProduct(p.getName());
    }

    public List<Product> getAllProducts() {
         return productRepository.getAllProducts();
    }

    public void addProductsExWithoutTx(List<Product> productList) {
        productRepository.addProductsExceptionWithoutTransaction(productList);
    }

    public void addProductTransactional(List<Product> productList) {
        productRepository.addProductTransactional(productList);
    }
}
