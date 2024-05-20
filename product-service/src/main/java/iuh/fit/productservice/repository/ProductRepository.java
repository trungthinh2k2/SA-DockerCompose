package iuh.fit.productservice.repository;

import iuh.fit.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {


}