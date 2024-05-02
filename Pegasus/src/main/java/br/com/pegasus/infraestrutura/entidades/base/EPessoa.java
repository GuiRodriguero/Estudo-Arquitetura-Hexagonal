package br.com.pegasus.infraestrutura.entidades.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
@MappedSuperclass
public class EPessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String cpf;
    @NotBlank
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}
