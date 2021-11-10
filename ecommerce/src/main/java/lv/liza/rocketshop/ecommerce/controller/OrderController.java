package lv.liza.rocketshop.ecommerce.controller;

import lv.liza.rocketshop.ecommerce.dto.OrderProductDto;
import lv.liza.rocketshop.ecommerce.exception.ResourceNotFoundException;
import lv.liza.rocketshop.ecommerce.model.OrderStatus;
import lv.liza.rocketshop.ecommerce.repository.Order;
import lv.liza.rocketshop.ecommerce.repository.OrderProduct;
import lv.liza.rocketshop.ecommerce.service.OrderProductService;
import lv.liza.rocketshop.ecommerce.service.OrderService;
import lv.liza.rocketshop.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderProductService orderProductService;

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return this.orderService.getAllOrders();
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody OrderForm form) throws Exception {
        List<OrderProductDto> formDtos = form.getProductOrders();
        validateProductsExistence(formDtos);
        Order order = new Order();
        order.setStatus(OrderStatus.PAID.name());
        order = this.orderService.create(order);

        List<OrderProduct> orderProducts = new ArrayList<>();
        for (OrderProductDto dto : formDtos) {
            orderProducts.add(orderProductService.create(new OrderProduct(order, productService.getProduct(dto
                    .getProduct()
                    .getId()), dto.getQuantity())));
        }

        order.setOrderProducts(orderProducts);

        this.orderService.update(order);

        String uri = ServletUriComponentsBuilder
                .fromCurrentServletMapping()
                .path("/orders/{id}")
                .buildAndExpand(order.getId())
                .toString();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", uri);

        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
    }

    private void validateProductsExistence(List<OrderProductDto> orderProducts)  {
        try {
            List<OrderProductDto> list = orderProducts
                    .stream()
                    .filter(op -> {
                        try {
                            return Objects.isNull(productService.getProduct(op
                                    .getProduct()
                                    .getId()));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    })
                    .collect(Collectors.toList());

            if (!CollectionUtils.isEmpty(list)) {
                new ResourceNotFoundException("Product not found");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static class OrderForm {

        private List<OrderProductDto> productOrders;

        public List<OrderProductDto> getProductOrders() {
            return productOrders;
        }

        public void setProductOrders(List<OrderProductDto> productOrders) {
            this.productOrders = productOrders;
        }
    }

}
