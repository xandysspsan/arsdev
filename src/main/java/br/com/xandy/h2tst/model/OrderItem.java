package br.com.xandy.h2tst.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidade referente a item de pedido.
 *
 * @author xandy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item_pedido")
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private Long orderId;

    private Date purchaseDate;
}
