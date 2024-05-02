package br.com.pegasus.aplicacao.dto;

import br.com.pegasus.aplicacao.dto.base.UsuarioDTO;

import java.util.List;

public class ProfessorDTO extends UsuarioDTO {
    private List<CursoDTO> cursos;
}
