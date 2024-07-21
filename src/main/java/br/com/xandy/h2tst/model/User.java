package br.com.xandy.h2tst.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Entidade referente ao usuário.
 *
 * @author xandy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class User implements Serializable {

    @Id
    private Long userId;

    private String userName;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
