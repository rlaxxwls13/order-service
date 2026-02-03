package pre_camp.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pre_camp.order_service.domain.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
