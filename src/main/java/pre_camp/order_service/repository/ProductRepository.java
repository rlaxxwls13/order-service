package pre_camp.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pre_camp.order_service.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
