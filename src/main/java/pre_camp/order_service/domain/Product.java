package pre_camp.order_service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
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
    @Column(nullable = false) @Builder.Default
    private boolean deleted = false;

    public void softDelete() {
        this.deleted = true;
    }
}
