package br.com.pegasus.dominio.atores;

import br.com.pegasus.dominio.atores.base.Ator;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;

public class Curso extends Ator {
    private List<Professor> professores;
    private List<String> materiaisDidaticos;
    private List<LocalDate> horariosDeAula;

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<String> getMateriaisDidaticos() {
        return materiaisDidaticos;
    }

    public void setMateriaisDidaticos(List<String> materiaisDidaticos) {
        this.materiaisDidaticos = materiaisDidaticos;
    }

    public List<LocalDate> getHorariosDeAula() {
        return horariosDeAula;
    }

    public void setHorariosDeAula(List<LocalDate> horariosDeAula) {
        this.horariosDeAula = horariosDeAula;
    }

    public void adicionaProfessorAoCurso(Professor professor) {
        if (professor.getCursos().size() < 3) {
            professores.add(professor);
        }
        throw new RuntimeException("Professor já está em 3 cursos");
    }

    public void adicionaMaterialDidaticoAoCurso(String materialDidatico) {
        materiaisDidaticos.add(materialDidatico);
    }

    public void adicionaHorarioDeAulaAoCurso(LocalDate horarioDeAula) {
        if (horarioDeAula.isAfter(ChronoLocalDate.from(horarioDeAula.atTime(18, 0))) ||
                horarioDeAula.isBefore(ChronoLocalDate.from(horarioDeAula.atTime(6, 0)))) {
            throw new RuntimeException("Horário de aula não pode ser depois das 18h ou antes das 6h");
        }
        horariosDeAula.add(horarioDeAula);
    }
}
