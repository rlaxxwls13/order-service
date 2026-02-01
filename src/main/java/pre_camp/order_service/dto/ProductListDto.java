package pre_camp.order_service.dto;

import lombok.Builder;
import pre_camp.order_service.domain.Product;

@Builder
public class ProductListDto {
    private Long productId;
    private String name;
    private double price;
    private int quantity;

    public static ProductListDto toDto(Product product) {
        return ProductListDto.builder()
                .productId(product.getProductId())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
    }
}
