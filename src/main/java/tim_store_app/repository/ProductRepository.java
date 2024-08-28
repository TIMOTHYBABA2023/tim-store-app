package tim_store_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tim_store_app.models.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
