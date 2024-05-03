package br.com.pegasus.dominio.atores;

import br.com.pegasus.dominio.atores.base.Usuario;

/**
 * Um dos Atores do nosso sistema. É uma das classes que compõem o domínio da aplicação.
 */
public class Administrador extends Usuario {
    private String cargo;
    private String setor;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
