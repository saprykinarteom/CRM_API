package saprykinav.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Orders")
@Data
@JsonRootName(value = "Order")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class Order implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_ID")
    private Long id;
    @Column(name = "Service_Name")
    private String serviceName;
    @Column(name = "Target_URL")
    private String targetURL;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "CustomerId")
    @JsonIgnore
    private Long customerId;
}
