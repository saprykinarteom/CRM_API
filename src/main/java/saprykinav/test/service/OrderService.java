package saprykinav.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saprykinav.test.entity.Customer;
import saprykinav.test.entity.Order;
import saprykinav.test.repository.CustomerRepository;
import saprykinav.test.repository.OrderRepository;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerRepository customerRepository;

    public void createOrder(Order order){
        orderRepository.save(order);
    }

    public boolean deleteOrder (Long id) {
        orderRepository.deleteById(id);
        if(orderRepository.existsById(id)) return false;
        else return true;
    }
    public boolean updateOrder(@NotNull Order order, int id){
        if (!orderRepository.existsById(Long.valueOf(id))) return false;
        orderRepository.save(order);
        return true;
    }
    public Iterable<Order> readOrder() { return orderRepository.findAll();}
    public Optional<Order> readOrder(Long id) {
        return orderRepository.findById(id);
    }

}
