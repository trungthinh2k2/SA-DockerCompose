package iuh.fit.productservice.service;

import iuh.fit.productservice.entity.Product;
import iuh.fit.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {


    public List<Product> getListProduct();

    public Product getProductById(int id);

    public Product createProduct(Product product);

    public void deleteProduct(int id);

}
