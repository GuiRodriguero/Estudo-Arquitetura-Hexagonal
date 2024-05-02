package br.com.pegasus.aplicacao.dto;

import br.com.pegasus.aplicacao.dto.base.PessoaDTO;

public class AlunoDTO extends PessoaDTO {
    private String matricula;
    private CursoDTO curso;
    private String turma;
    private String turno;
}
