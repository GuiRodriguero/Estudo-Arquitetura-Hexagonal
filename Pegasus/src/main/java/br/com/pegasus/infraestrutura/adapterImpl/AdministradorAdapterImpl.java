package br.com.pegasus.infraestrutura.adapterImpl;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.saida.AdministradorAdapter;
import br.com.pegasus.infraestrutura.adapterImpl.base.AdapterImpl;
import br.com.pegasus.infraestrutura.entidades.EAdministrador;
import br.com.pegasus.infraestrutura.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AdministradorAdapterImpl extends AdapterImpl<Administrador, EAdministrador> implements AdministradorAdapter {

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
