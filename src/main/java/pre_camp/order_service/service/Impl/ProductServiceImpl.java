package pre_camp.order_service.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pre_camp.order_service.domain.Product;
import pre_camp.order_service.dto.AddProductDto;
import pre_camp.order_service.dto.ProductDetailDto;
import pre_camp.order_service.dto.ProductListDto;
import pre_camp.order_service.dto.UpdateProductDto;
import pre_camp.order_service.error.ErrorCode;
import pre_camp.order_service.error.exception.BusinessException;
import pre_camp.order_service.repository.ProductRepository;
import pre_camp.order_service.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    @Transactional
    public void addProduct(AddProductDto addProductDto) {
        Product product = addProductDto.toEntity();
        productRepository.save(product);
    }

    @Override
    @Transactional
    public List<ProductListDto> getProductList() {
        return productRepository.findByDeletedFalse().stream()
                .map(ProductListDto::toDto)
                .toList();
    }

    @Override
    @Transactional
    public ProductDetailDto getProductDetails(Long productId) {
        return productRepository.findByProductIdAndDeletedFalse(productId)
                .map(ProductDetailDto::toDto)
                .orElseThrow(() -> new BusinessException(ErrorCode.PRODUCT_NOT_FOUND));
    }

    @Override
    public void updateProduct(UpdateProductDto updateProductDto) {

    }

    @Override
    @Transactional
    public void deleteProduct(Long productId) {
        Product product = productRepository.findByProductIdAndDeletedFalse(productId)
                .orElseThrow(() -> new BusinessException(ErrorCode.PRODUCT_NOT_FOUND));
        product.softDelete();
    }
}
