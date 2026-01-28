package pre_camp.order_service.dto;

import pre_camp.order_service.domain.Product;

public class AddProductDto {
    private String name;
    private int price;
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
