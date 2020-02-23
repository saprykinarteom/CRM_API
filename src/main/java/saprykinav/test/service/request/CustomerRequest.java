package saprykinav.test.service.request;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomerRequest {
    private Long id;
    private String firstName;
    private String lastName;
}
