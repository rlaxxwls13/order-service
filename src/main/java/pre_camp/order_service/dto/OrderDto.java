package pre_camp.order_service.dto;

import lombok.Getter;
import pre_camp.order_service.domain.Order;
import pre_camp.order_service.domain.Product;

@Getter
public class OrderDto {
    private Long productId;
    private int quantity;

    public Order toEntity(Product product) {
        return Order.builder()
                .product(product)
                .quantity(quantity)
                .build();
    }
}
