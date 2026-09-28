package re.edu.hw.ss15.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.hw.ss15.ex02.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
