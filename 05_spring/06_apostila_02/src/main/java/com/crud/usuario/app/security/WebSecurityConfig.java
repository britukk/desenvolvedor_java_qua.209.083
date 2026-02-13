package com.crud.usuario.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

@EnableWebSecurity

public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
            // Permite acesso sem login à pagina de cadastro e ao salvamento
                .requestMatchers("/cadastro", "/salvarUsuario", "/css/**" ).permitAll()
                // Qualquer outra requisição exige autenticação
                .anyRequest().authenticated() // Exige autenticação para outras rotas
                )
            .formLogin((form) -> form
                .loginPage("/login") // Define nossa página customizada de login
                .defaultSuccessUrl("/home", true) // Redireciona para /home após login bem-sucedido
                .permitAll() // Permite acesso à página de login sem autenticação
            )
            .logout((logout) -> logout
                .logoutUrl("/logout") // URL para acionar logout
                .logoutSuccessUrl("/login?logout") // Para onde vai sair após sair (logout)
                .permitAll() // Permite acesso à funcionalidade de logout sem autenticação
            );

        return http.build();
    }

    // Bean para criptografar senhas (Hash) [6]
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
