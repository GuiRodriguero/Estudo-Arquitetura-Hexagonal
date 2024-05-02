package br.com.pegasus.dominio.ports.saida;

import br.com.pegasus.dominio.atores.Curso;
import br.com.pegasus.dominio.atores.Professor;
import br.com.pegasus.dominio.ports.saida.base.BaseAdapter;

import java.util.List;

public interface CursoAdapter extends BaseAdapter<Curso> {
    List<Curso> findCursosByProfessor(Professor professor);
}
