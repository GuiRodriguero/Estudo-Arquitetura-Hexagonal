package br.com.pegasus.dominio.ports.entrada;

import br.com.pegasus.dominio.atores.Curso;
import br.com.pegasus.dominio.atores.Professor;
import br.com.pegasus.dominio.ports.entrada.base.BaseUseCase;

import java.util.List;

public interface CursoUseCase extends BaseUseCase<Curso> {
    List<Curso> findCursosByProfessor(Professor professor);
}
