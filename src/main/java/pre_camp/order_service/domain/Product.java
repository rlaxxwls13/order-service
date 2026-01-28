package pre_camp.order_service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Long productId;
    private String name;
    private double price;
    private int quantity;
    private String description;
}
