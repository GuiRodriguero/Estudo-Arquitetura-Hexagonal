package br.com.pegasus.dominio.useCase;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.saida.AdministradorPortaSaida;

/**
 * Atua como service, armazenando nossa regra de negócio. Pelo fato de armazenar a regra de negócio, deve se manter isolado.
 * Implementamos a Porta de Entrada de Admin. Sendo assim, quando chamarmos administradorAdapterEntrada.criar no nosso Controller, ele irá cair aqui
 */
public class AdministradorUseCase {

    private final AdministradorPortaSaida administradorPortaSaida;

    public AdministradorUseCase(AdministradorPortaSaida administradorPortaSaida) {
        this.administradorPortaSaida = administradorPortaSaida;
    }

    public void criar(Administrador ator) {
        this.administradorPortaSaida.salvar(ator);
    }

    public Administrador buscarPorId(Long id) {
        return this.administradorPortaSaida.buscarPorId(id);
    }
}
