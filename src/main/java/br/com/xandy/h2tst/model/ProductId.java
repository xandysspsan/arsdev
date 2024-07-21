package br.com.xandy.h2tst.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Classe referente a chave primária composta de produto.
 *
 * @author xandy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductId implements Serializable {

    @EqualsAndHashCode.Include
    private Long productId;

    @EqualsAndHashCode.Include
    private Long orderItemId;

}
