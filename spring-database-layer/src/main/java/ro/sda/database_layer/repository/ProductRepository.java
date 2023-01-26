package ro.sda.database_layer.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sda.database_layer.mapper.ProductRowMapper;
import ro.sda.database_layer.model.Product;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    // JDBCTemplate is injected automatically by spring using constructor
    // There is no need to annotate with @Autowired when using constructor injection
    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void initDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS product(id bigint auto_increment, name varchar(255))";
        jdbcTemplate.update(sql);
    }


    public void addProduct(String name) {
        String sql = "INSERT INTO product(name) VALUES(?)";
        jdbcTemplate.update(sql, name);
    }

    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

    public void addProductsExceptionWithoutTransaction(List<Product> productList) {
        for (int i = 0; i < productList.size(); i++) {
            String sql = "INSERT INTO product(name) VALUES(?)";
            jdbcTemplate.update(sql, productList.get(i).getName());
            if (i==1) {
                throw new RuntimeException("Exception during database update!");
            }
        }
    }

    @Transactional
    public void addProductTransactional(List<Product> productList) {
        for (int i = 0; i < productList.size(); i++) {
            String sql = "INSERT INTO product(name) VALUES(?)";
            jdbcTemplate.update(sql, productList.get(i).getName());
            if (i==1) {
                throw new RuntimeException("Exception during database update!");
            }
        }
    }


}
