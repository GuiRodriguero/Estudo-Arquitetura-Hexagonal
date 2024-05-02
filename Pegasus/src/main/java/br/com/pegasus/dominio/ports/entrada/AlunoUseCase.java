package br.com.pegasus.dominio.ports.entrada;

import br.com.pegasus.dominio.atores.Aluno;
import br.com.pegasus.dominio.ports.entrada.base.BaseUseCase;

public interface AlunoUseCase extends BaseUseCase<Aluno> {
    Aluno findAlunoByMatricula(String matricula);
}
