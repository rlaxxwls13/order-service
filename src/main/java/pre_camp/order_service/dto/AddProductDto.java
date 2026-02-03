package pre_camp.order_service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pre_camp.order_service.domain.Product;

@Getter
@Setter
@NoArgsConstructor
public class AddProductDto {
    private String name;
    private double price;
    private int quantity;
    private String description;

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .price(price)
                .quantity(quantity)
                .description(description)
                .build();
    }
}
