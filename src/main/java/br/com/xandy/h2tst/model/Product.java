package br.com.xandy.h2tst.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
@IdClass(ProductId.class)
public class Product implements Serializable {

    @Id
    @Column(name = "product_id")
    @EqualsAndHashCode.Include
    private Long productId;

    @Id
    @Column(name = "order_item_id")
    @EqualsAndHashCode.Include
    private Long orderItemId;

    private BigDecimal value;

}
