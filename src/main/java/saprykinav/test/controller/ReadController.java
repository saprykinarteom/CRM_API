package saprykinav.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import saprykinav.test.entity.Customer;
import saprykinav.test.entity.Order;
import saprykinav.test.repository.CustomerRepository;
import saprykinav.test.repository.OrderRepository;
import saprykinav.test.service.CustomerService;

import java.util.Optional;
import java.util.Set;

@RestController
public class ReadController {
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderRepository orderRepository;
    @GetMapping("/customers")
    public Iterable<Customer> readCustomer(){
        return customerService.readCustomer();
    }
    @GetMapping("/customers/{id}")
    public Customer readCustomer(@PathVariable(name = "id") int id) {
        return customerService.readCustomer(Long.valueOf(id)).get();
    }
}
