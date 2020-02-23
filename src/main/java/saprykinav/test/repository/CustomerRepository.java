package saprykinav.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saprykinav.test.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
