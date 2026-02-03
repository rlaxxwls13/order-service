package pre_camp.order_service.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pre_camp.order_service.domain.Order;
import pre_camp.order_service.domain.Product;
import pre_camp.order_service.dto.OrderDetailDto;
import pre_camp.order_service.dto.OrderDto;
import pre_camp.order_service.error.ErrorCode;
import pre_camp.order_service.error.exception.BusinessException;
import pre_camp.order_service.repository.OrderRepository;
import pre_camp.order_service.repository.ProductRepository;
import pre_camp.order_service.service.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @Override
    @Transactional
    public void createOrder(OrderDto orderDto) {
        Product product = productRepository.findByProductIdAndDeletedFalse(orderDto.getProductId())
                .orElseThrow(() -> new BusinessException(ErrorCode.PRODUCT_NOT_FOUND));
        Order order = orderDto.toEntity(product);
        orderRepository.save(order);
    }

    @Override
    public OrderDetailDto getOrderDetails(Long orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new BusinessException(ErrorCode.ORDER_NOT_FOUND));
        return OrderDetailDto.toDto(order);
    }

    @Override
    public void getOrderList() {

    }
}
