package pre_camp.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pre_camp.order_service.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
