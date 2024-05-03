package br.com.pegasus.infraestrutura.config;

import br.com.pegasus.dominio.ports.saida.AdministradorPortaSaida;
import br.com.pegasus.dominio.useCase.AdministradorUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjetaUseCases {

    @Bean
    public AdministradorUseCase administradorUseCase(AdministradorPortaSaida administradorPortaSaida) {
        return new AdministradorUseCase(administradorPortaSaida);
    }

}
