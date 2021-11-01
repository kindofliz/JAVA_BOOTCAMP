package lv.liza.rocketshop.ecommerce.service;

import lv.liza.rocketshop.ecommerce.repository.OrderProduct;
import lv.liza.rocketshop.ecommerce.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImp implements OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImp(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }


    public OrderProductRepository getOrderProductRepository() {
        return orderProductRepository;
    }

    public void setOrderProductRepository(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }
}
