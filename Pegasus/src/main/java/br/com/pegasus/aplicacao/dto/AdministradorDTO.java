package br.com.pegasus.aplicacao.dto;

import br.com.pegasus.aplicacao.dto.base.UsuarioDTO;
import br.com.pegasus.dominio.atores.Administrador;

public class AdministradorDTO extends UsuarioDTO {
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

    public Administrador toDominio() {
        Administrador administrador = new Administrador();
        administrador.setCargo(this.cargo);
        administrador.setSetor(this.setor);
        administrador.setCpf(this.getCpf());
        administrador.setNome(this.getNome());
        administrador.setEmail(this.getEmail());
        administrador.setTelefone(this.getTelefone());
        administrador.setEndereco(this.getEndereco());
        administrador.setLogin(this.getLogin());
        administrador.setSenha(this.getSenha());
        return administrador;
    }
}
