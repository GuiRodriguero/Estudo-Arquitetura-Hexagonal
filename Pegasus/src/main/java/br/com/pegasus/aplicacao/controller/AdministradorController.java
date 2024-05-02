package br.com.pegasus.aplicacao.controller;

import br.com.pegasus.aplicacao.dto.AdministradorDTO;
import br.com.pegasus.aplicacao.useCaseImpl.AdministradorUseCaseImpl;
import br.com.pegasus.dominio.atores.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private AdministradorUseCaseImpl administradorUseCase;

    @PostMapping("/cadastrar")
    public void cadastrarAdministrador(@RequestBody AdministradorDTO administradorDTO) {
        administradorUseCase.criar(administradorDTO.toDominio());
    }

    @GetMapping("/{id}")
    public AdministradorDTO buscarAdministrador(@PathVariable Long id) {
        return toDTO(administradorUseCase.buscarPorId(id));
    }

    public AdministradorDTO toDTO(Administrador administrador) {
        AdministradorDTO dto = new AdministradorDTO();
        dto.setNome(administrador.getNome());
        dto.setCpf(administrador.getCpf());
        dto.setEmail(administrador.getEmail());
        dto.setTelefone(administrador.getTelefone());
        dto.setEndereco(administrador.getEndereco());
        dto.setLogin(administrador.getLogin());
        dto.setSenha(administrador.getSenha());
        dto.setCargo(administrador.getCargo());
        dto.setSetor(administrador.getSetor());
        return dto;
    }

}
