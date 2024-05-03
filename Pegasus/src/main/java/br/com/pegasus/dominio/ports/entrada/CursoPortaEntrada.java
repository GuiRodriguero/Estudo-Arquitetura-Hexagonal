package br.com.pegasus.dominio.ports.entrada;

import br.com.pegasus.dominio.atores.Curso;
import br.com.pegasus.dominio.atores.Professor;
import br.com.pegasus.dominio.ports.entrada.base.BasePortaEntrada;

import java.util.List;

public interface CursoPortaEntrada extends BasePortaEntrada<Curso> {
    List<Curso> findCursosByProfessor(Professor professor);
}
