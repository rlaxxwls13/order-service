package pre_camp.order_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pre_camp.order_service.dto.AddProductDto;
import pre_camp.order_service.dto.ProductDetailDto;
import pre_camp.order_service.dto.ProductListDto;
import pre_camp.order_service.service.ProductService;

import javax.print.DocFlavor;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product/new")
    public ResponseEntity<String> addProduct(AddProductDto addProductDto) {
        productService.addProduct(addProductDto);
        return new ResponseEntity<>("Product added", HttpStatus.OK);
    }

    @GetMapping("/product/list")
    public ResponseEntity<List<ProductListDto>> getProductList() {
        List<ProductListDto> productList = productService.getProductList();
        return ResponseEntity.ok(productList);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductDetailDto> getProductDetails(@PathVariable Long productId) {
        ProductDetailDto productDetails = productService.getProductDetails(productId);
        return ResponseEntity.ok(productDetails);
    }
}