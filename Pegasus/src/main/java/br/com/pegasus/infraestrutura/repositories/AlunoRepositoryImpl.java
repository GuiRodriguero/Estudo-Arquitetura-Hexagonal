package br.com.pegasus.infraestrutura.repositories;

import br.com.pegasus.infraestrutura.entidades.EAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositoryImpl extends JpaRepository<EAluno, Long> {
}
