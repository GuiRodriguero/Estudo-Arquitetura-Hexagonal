package br.com.pegasus.infraestrutura.adapters;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.saida.AdministradorPortaSaida;
import br.com.pegasus.infraestrutura.adapters.base.AdapterSaidaBase;
import br.com.pegasus.infraestrutura.entidades.EAdministrador;
import br.com.pegasus.infraestrutura.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Classe responsável pela comunicação entre o domínio e a infraestrutura no contexto de Administrador
 */
@Component
public class AdministradorAdapterSaida extends AdapterSaidaBase<Administrador, EAdministrador> implements AdministradorPortaSaida {

    @Autowired
    private AdministradorRepository repository;

    @Override
    public void salvar(Administrador ator) {
        repository.save(toEntidade(ator, EAdministrador.class));
    }

    @Override
    public Administrador buscarPorId(Long id) {
        return toDominio(Objects.requireNonNull(repository.findById(id).orElse(null)), Administrador.class);
    }
}
