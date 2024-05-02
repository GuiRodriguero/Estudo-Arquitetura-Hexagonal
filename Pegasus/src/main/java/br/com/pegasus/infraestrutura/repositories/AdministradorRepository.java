package br.com.pegasus.infraestrutura.repositories;

import br.com.pegasus.infraestrutura.entidades.EAdministrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<EAdministrador, Long> {
}
