package re.edu.hw.ss15.ex02.service;

import re.edu.hw.ss15.ex02.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    Product create(Product product);

    Product update(Long id, Product product);

    void delete(Long id);
}
