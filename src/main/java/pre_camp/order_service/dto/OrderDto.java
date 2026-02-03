package pre_camp.order_service.dto;

import lombok.Getter;
import lombok.Setter;
import pre_camp.order_service.domain.Orders;
import pre_camp.order_service.domain.Product;

@Getter
@Setter
public class OrderDto {
    private Long productId;
    private int quantity;

    public Orders toEntity(Product product) {
        return Orders.builder()
                .product(product)
                .quantity(quantity)
                .build();
    }
}
