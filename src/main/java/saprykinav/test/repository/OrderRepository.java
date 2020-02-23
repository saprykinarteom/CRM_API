package saprykinav.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saprykinav.test.entity.Order;

import java.util.Set;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    public Set<Order> findByCustomerId (Long customerID);
}
