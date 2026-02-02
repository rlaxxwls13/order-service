package pre_camp.order_service.service;

import pre_camp.order_service.domain.Product;
import pre_camp.order_service.dto.AddProductDto;
import pre_camp.order_service.dto.ProductDetailDto;
import pre_camp.order_service.dto.ProductListDto;
import pre_camp.order_service.dto.UpdateProductDto;

import java.util.List;

public interface ProductService {
    // 상품 등록
    void addProduct(AddProductDto addProductDto);
    // 상품 목록 조회
    List<ProductListDto> getProductList();
    // 상품 단건 조회
    ProductDetailDto getProductDetails(Long productId);
    // 상품 수정
    void updateProduct(Long productId, UpdateProductDto updateProductDto);
    // 상품 삭제
    void deleteProduct(Long productId);
}
