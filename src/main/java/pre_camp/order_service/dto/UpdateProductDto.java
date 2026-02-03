package pre_camp.order_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProductDto {

    private String name;
    private double price;
    private int quantity;
    private String description;
}
