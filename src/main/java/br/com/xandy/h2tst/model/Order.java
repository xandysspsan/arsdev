package br.com.xandy.h2tst.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Entidade referente ao pedido.
 *
 * @author xandy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedido")
@IdClass(OrderId.class)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order implements Serializable {

    @Id
    @Column(name = "order_id")
    @EqualsAndHashCode.Include
    private Long orderId;

    @Id
    @Column(name = "user_id")
    @EqualsAndHashCode.Include
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

}
