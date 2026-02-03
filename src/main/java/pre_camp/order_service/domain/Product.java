package pre_camp.order_service.domain;

import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.ast.Or;
import pre_camp.order_service.dto.UpdateProductDto;
import pre_camp.order_service.error.ErrorCode;
import pre_camp.order_service.error.exception.BusinessException;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private double price;
    private int quantity;
    private String description;
    @Column(nullable = false) @Builder.Default
    private boolean deleted = false;

    @OneToMany(mappedBy = "product")
    private List<Order> orders = new ArrayList<>();

    public void softDelete() {
        this.deleted = true;
    }

    public void update(UpdateProductDto updateProductDto) {
        validateForUpdate(updateProductDto);

        this.name = updateProductDto.getName();
        this.price = updateProductDto.getPrice();
        this.quantity = updateProductDto.getQuantity();
        this.description = updateProductDto.getDescription();
    }

    private void validateForUpdate(UpdateProductDto updateProductDto) {
        if (updateProductDto.getPrice() < 0) {
            throw new BusinessException(ErrorCode.INVALID_PRICE);
        }
        if (updateProductDto.getQuantity() < 0) {
            throw new BusinessException(ErrorCode.INVALID_QUANTITY);
        }
    }
}
