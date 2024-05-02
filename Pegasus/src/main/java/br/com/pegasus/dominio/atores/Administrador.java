package br.com.pegasus.dominio.atores;

import br.com.pegasus.dominio.atores.base.Usuario;

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
