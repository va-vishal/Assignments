package in.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vishal.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
