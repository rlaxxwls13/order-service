package pre_camp.order_service.service;

import pre_camp.order_service.domain.Product;
import pre_camp.order_service.dto.AddProductDto;
import pre_camp.order_service.dto.UpdateProductDto;

public interface ProductService {
    // 상품 등록
    void addProduct(AddProductDto addProductDto);
    // 상품 목록 조회
    void getProductList();
    // 상품 단건 조회
    void getProductDetails();
    // 상품 수정
    void updateProduct(UpdateProductDto updateProductDto);
    // 상품 삭제
    void deleteProduct();
}
