package pre_camp.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pre_camp.order_service.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByDeletedFalse();
    Optional<Product> findByProductIdAndDeletedFalse(Long id);
}
