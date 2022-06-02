package main.java.br.com.letscode.products.repositories;

import br.com.letscode.products.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}