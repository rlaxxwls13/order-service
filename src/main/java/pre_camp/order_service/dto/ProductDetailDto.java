package pre_camp.order_service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pre_camp.order_service.domain.Product;

@Getter
@Setter
@Builder
public class ProductDetailDto {
    private Long productId;
    private String name;
    private double price;
    private int quantity;
    private String description;

    public static ProductDetailDto toDto(Product product) {
        return ProductDetailDto.builder()
                .productId(product.getProductId())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .description(product.getDescription())
                .build();
    }
}
