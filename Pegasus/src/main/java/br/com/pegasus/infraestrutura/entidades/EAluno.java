package br.com.pegasus.infraestrutura.entidades;

import br.com.pegasus.infraestrutura.entidades.base.EPessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ALUNO")
public class EAluno extends EPessoa {

    private String matricula;
    private String turma;
    private String turno;

    @ManyToOne(targetEntity = ECurso.class)
    private ECurso curso;

    @Override
    @Column(name = "ALUNO_ID")
    public Long getId() {
        return super.getId();
    }
}
