package br.com.pegasus.dominio.ports.saida;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.saida.base.BasePortaSaida;

/**
 * Porta de saída para a classe de domínio {@link Administrador}. Aqui é onde o módulo de
 * infraestrutura implementará como a comunicação com o banco será feita
 */
public interface AdministradorPortaSaida extends BasePortaSaida<Administrador> {
}
