package br.com.pegasus.dominio.ports.saida;

import br.com.pegasus.dominio.atores.Aluno;
import br.com.pegasus.dominio.ports.saida.base.BasePortaSaida;

public interface AlunoPortaSaida extends BasePortaSaida<Aluno> {
    Aluno findAlunoByMatricula(String matricula);
}
