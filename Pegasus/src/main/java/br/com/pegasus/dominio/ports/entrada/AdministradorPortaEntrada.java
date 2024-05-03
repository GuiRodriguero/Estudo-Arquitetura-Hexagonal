package br.com.pegasus.dominio.ports.entrada;

import br.com.pegasus.dominio.atores.Administrador;
import br.com.pegasus.dominio.ports.entrada.base.BasePortaEntrada;

/**
 * Porta de entrada para a classe de domínio {@link Administrador}. Aqui é onde o módulo de aplicação implementará
 * como que a classe {@link Administrador} será manipulada na sua interação entre o controller e o banco de dados
 */
public interface AdministradorPortaEntrada extends BasePortaEntrada<Administrador> {
}
