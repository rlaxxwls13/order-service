package pre_camp.order_service.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pre_camp.order_service.domain.Product;
import pre_camp.order_service.dto.AddProductDto;
import pre_camp.order_service.dto.ProductListDto;
import pre_camp.order_service.dto.UpdateProductDto;
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
    public List<ProductListDto> getProductList() {
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(ProductListDto::toDto)
                .toList();
    }

    @Override
    public void getProductDetails() {

    }

    @Override
    public void updateProduct(UpdateProductDto updateProductDto) {

    }

    @Override
    public void deleteProduct() {

    }
}
