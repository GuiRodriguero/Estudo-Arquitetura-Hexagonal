package br.com.pegasus.dominio.ports.entrada;

import br.com.pegasus.dominio.atores.Aluno;
import br.com.pegasus.dominio.ports.entrada.base.BasePortaEntrada;

public interface AlunoPortaEntrada extends BasePortaEntrada<Aluno> {
    Aluno findAlunoByMatricula(String matricula);
}
