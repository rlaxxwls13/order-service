package pre_camp.order_service.service;

import pre_camp.order_service.dto.OrderDto;

public interface OrderService {

    void createOrder(OrderDto orderDto);
    void getOrderList(Long orderId);
}
