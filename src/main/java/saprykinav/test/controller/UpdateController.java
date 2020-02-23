package saprykinav.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import saprykinav.test.entity.Customer;
import saprykinav.test.service.CustomerService;

@RestController
public class UpdateController {
    @Autowired
    CustomerService customerService;

    @PutMapping("/customer/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable (name = "id") int id, @RequestBody Customer customer){
        if(customerService.updateCustomer(customer, id)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
