package br.com.pegasus.infraestrutura.entidades;

import br.com.pegasus.infraestrutura.entidades.base.EUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_ADMINISTRADOR")
@SequenceGenerator(name="EAdministrador", sequenceName = "SQ_TB_ADMINISTRADOR", allocationSize = 1)
public class EAdministrador extends EUsuario {
    private String cargo;
    private String setor;

    @Override
    @Column(name = "ADMINISTRADOR_ID")
    @GeneratedValue(generator = "EAdministrador", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return super.getId();
    }
}
