package br.com.pegasus.infraestrutura.repositories;

import br.com.pegasus.infraestrutura.entidades.ECurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositoryImpl extends JpaRepository<ECurso, Long> {
}