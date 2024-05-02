package br.com.pegasus.dominio.ports.saida;

import br.com.pegasus.dominio.atores.Aluno;
import br.com.pegasus.dominio.ports.saida.base.BaseAdapter;

public interface AlunoAdapter extends BaseAdapter<Aluno> {
    Aluno findAlunoByMatricula(String matricula);
}
