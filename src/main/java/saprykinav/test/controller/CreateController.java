package saprykinav.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import saprykinav.test.entity.Customer;
import saprykinav.test.service.CustomerService;

@RestController
public class CreateController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<?> createCustomer (@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
