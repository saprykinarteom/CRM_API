package saprykinav.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import saprykinav.test.entity.Customer;
import saprykinav.test.entity.Order;
import saprykinav.test.repository.OrderRepository;
import saprykinav.test.service.CustomerService;
import saprykinav.test.service.OrderService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }
}
