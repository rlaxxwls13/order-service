package pre_camp.order_service.dto;

import lombok.Builder;
import pre_camp.order_service.domain.Order;

@Builder
public class OrderDetailDto {
    private Long productId;
    private String productName;
    private int quantity;

    public static OrderDetailDto toDto(Order order) {
        return OrderDetailDto.builder()
                .productId(order.getProduct().getProductId())
                .productName(order.getProduct().getName())
                .quantity(order.getQuantity())
                .build();
    }
}
