package br.com.pegasus.aplicacao;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.entrada.AdministradorPortaEntrada;
import br.com.pegasus.dominio.useCase.AdministradorUseCase;
import org.springframework.stereotype.Component;

@Component
public class AdministradorAdapterEntrada implements AdministradorPortaEntrada {

    private final AdministradorUseCase service;

    public AdministradorAdapterEntrada(AdministradorUseCase service) {
        this.service = service;
    }

    @Override
    public void criar(Administrador ator) {
        service.criar(ator);
    }

    @Override
    public Administrador buscarPorId(Long id) {
        return service.buscarPorId(id);
    }
}
