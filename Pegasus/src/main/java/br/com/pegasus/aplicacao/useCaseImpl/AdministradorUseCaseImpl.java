package br.com.pegasus.aplicacao.useCaseImpl;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.entrada.AdministradorUseCase;
import br.com.pegasus.infraestrutura.adapterImpl.AdministradorAdapterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorUseCaseImpl implements AdministradorUseCase {

    @Autowired
    private AdministradorAdapterImpl administradorAdapter;

    @Override
    public void criar(Administrador objetoDominio) {
        administradorAdapter.salvar(objetoDominio);
    }

    @Override
    public Administrador buscarPorId(Long id) {
        return administradorAdapter.buscarPorId(id);
    }
}
