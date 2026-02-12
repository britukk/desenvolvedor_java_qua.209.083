package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Usuario findByLogin(String login);

}
