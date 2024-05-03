package br.com.pegasus.dominio.ports.saida;

import br.com.pegasus.dominio.atores.Curso;
import br.com.pegasus.dominio.atores.Professor;
import br.com.pegasus.dominio.ports.saida.base.BasePortaSaida;

import java.util.List;

public interface CursoPortaSaida extends BasePortaSaida<Curso> {
    List<Curso> findCursosByProfessor(Professor professor);
}
