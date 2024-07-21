package br.com.xandy.h2tst.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Classe referente a chave primária composta de pedido.
 *
 * @author xandy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderId implements Serializable {

    @EqualsAndHashCode.Include
    private Long orderId;

    @EqualsAndHashCode.Include
    private Long userId;

}
