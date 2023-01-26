package ro.sda.database_layer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.database_layer.config.ProjectConfig;
import ro.sda.database_layer.model.Product;
import ro.sda.database_layer.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductService productService = c.getBean(ProductService.class);
            productService.addProduct(new Product("product 5"));
            productService.addProduct(new Product("product 8"));
            productService.addProduct(new Product("product 9"));

            List<Product> results = productService.getAllProducts();
            System.out.println(results);

            try {
                productService.addProductsExWithoutTx(List.of(new Product("salt"),new Product("milk"),new Product("butter")));
            } catch (RuntimeException ex) {
                System.out.println(ex);
            }

            List<Product> results2 = productService.getAllProducts();
            System.out.println(results2);


            try {
                productService.addProductTransactional(List.of(new Product("bread"),new Product("eggs"),new Product("meat")));
            } catch (RuntimeException ex) {
                System.out.println(ex);
            }

            List<Product> results3 = productService.getAllProducts();
            System.out.println(results3);

        }
    }
}
