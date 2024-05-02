package br.com.pegasus.infraestrutura.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_CURSO")
public class ECurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "cursos")
    private List<EProfessor> professores;
//    @ElementCollection
//    private List<String> materiaisDidaticos;
//    @ElementCollection
//    private List<LocalDate> horariosDeAula;
    @OneToMany
    private List<EAluno> alunos;
}
