package br.com.pegasus.dominio.atores;

import br.com.pegasus.dominio.atores.base.Usuario;

import java.util.List;

public class Professor extends Usuario {
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
