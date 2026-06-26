package dev.menezes.mastersys.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("MasterSys - API de Gerenciamento de Academia")
                        .description("""
                                API REST para gerenciamento de academias.
                                
                                Funcionalidades disponíveis:
                                
                                • Gerenciamento de alunos
                                • Gerenciamento de matrículas
                                • Gerenciamento de modalidades
                                • Gerenciamento de planos
                                • Controle financeiro
                                • Relatórios gerenciais
                                
                                Projeto desenvolvido com Spring Boot para fins de estudo e portfólio.
                                """)
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Mauricio Menezes")
                                .email("mauricio.menezes2@icloud.com"))
                        .license(new License()
                                .name("Apache License 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8080")
                                .description("Servidor de desenvolvimento")
                ))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Repositório do projeto no GitHub")
                                .url("https://github.com/Menezes013/mastersys")
                );
    }
}