package com.crud.usuario.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.usuario.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Usuario findByLogin(String login); //Método mágico do Spring Data JPA para encontrar um usuário pelo login
}
