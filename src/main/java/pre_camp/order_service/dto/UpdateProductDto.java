package pre_camp.order_service.dto;

import lombok.Getter;

@Getter
public class UpdateProductDto {

    private String name;
    private double price;
    private int quantity;
    private String description;
}
