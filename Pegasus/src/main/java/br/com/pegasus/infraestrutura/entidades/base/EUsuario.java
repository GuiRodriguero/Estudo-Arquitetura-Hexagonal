package br.com.pegasus.infraestrutura.entidades.base;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@MappedSuperclass
public class EUsuario extends EPessoa {
    @NotBlank
    private String login;
    @NotBlank
    private String senha;
}
