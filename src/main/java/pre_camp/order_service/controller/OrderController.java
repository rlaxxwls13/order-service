package pre_camp.order_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pre_camp.order_service.dto.OrderDto;
import pre_camp.order_service.service.OrderService;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order/new")
    public ResponseEntity<String> createOrder(@RequestBody OrderDto orderDto) {
        orderService.createOrder(orderDto);
        return new ResponseEntity<>("order created", HttpStatus.OK);
    }
}
