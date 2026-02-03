package pre_camp.order_service.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "PRODUCT_NOT_FOUND", "존재하지 않는 상품입니다."),
    ORDER_NOT_FOUND(HttpStatus.NOT_FOUND, "PRODUCT_NOT_FOUND", "존재하지 않는 주문입니다."),

    INVALID_PRICE(HttpStatus.BAD_REQUEST, "PRODUCT_INVALID_PRICE","상품 가격은 0 이상이어야 합니다."),
    INVALID_QUANTITY(HttpStatus.BAD_REQUEST, "PRODUCT_INVALID_QUANTITY", "상품 수량은 0 이상이어야 합니다"),

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR","알 수 없는 오류가 발생했습니다. 관리자에게 문의하세요.");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(final HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
