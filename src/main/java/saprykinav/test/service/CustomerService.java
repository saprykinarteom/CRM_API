package saprykinav.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import saprykinav.test.entity.Customer;
import saprykinav.test.repository.CustomerRepository;
import saprykinav.test.repository.OrderRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Optional;

@Service
public class CustomerService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public boolean deleteCustomer (Long id) {
        customerRepository.deleteById(id);
        if(customerRepository.existsById(id)) return false;
        else return true;
    }
    public boolean updateCustomer(@NotNull Customer customer, int id){
        if (!customerRepository.existsById(Long.valueOf(id))) return false;
        customer.setOrders(orderRepository.findByCustomerId(Long.valueOf(id)));
        customerRepository.save(customer);
        return true;
    }
    public Iterable<Customer> readCustomer() { return customerRepository.findAll();}
    public Optional<Customer> readCustomer(Long id) {
        return customerRepository.findById(id);
    }


}
