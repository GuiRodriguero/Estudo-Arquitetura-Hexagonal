package br.com.pegasus.infraestrutura.entidades;

import br.com.pegasus.infraestrutura.entidades.base.EUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_PROFESSOR")
public class EProfessor extends EUsuario {

    @ManyToMany
    @JoinTable(name = "TB_CURSO_PROFESSOR",
            joinColumns = @JoinColumn(name = "PROFESSOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "CURSO_ID"))
    private List<ECurso> cursos;

    @Override
    @Column(name = "PROFESSOR_ID")
    public Long getId() {
        return super.getId();
    }
}
