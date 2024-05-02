package br.com.pegasus.aplicacao.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class CursoDTO {
    private UUID id;
    private List<ProfessorDTO> professores;
    private List<String> materiaisDidaticos;
    private List<LocalDate> horariosDeAula;
}
