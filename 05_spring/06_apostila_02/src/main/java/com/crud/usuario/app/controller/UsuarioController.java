package com.crud.usuario.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.usuario.app.models.Usuario;
import com.crud.usuario.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder; //Injeta o decodificador de senha (Hash)

    //Página de login personalizada
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Retorna o arquivo login.html
    }

    //Página principal (protegida)
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("usuarios", repository.findAll()); // Adiciona a lista de usuários ao modelo para exibição
        return "home"; // Retorna o arquivo home.html
    }

    //Formulário de cadastro de novo usuário
    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro"; // Retorna cadastro.html
    }

    //Ação de salvar usuário
    @PostMapping("/salvarUsuario")
    public String salvarUsuario(Usuario usuario) {
        //Criptografa a senha antes de salvar [6]
        String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);

        repository.save(usuario); // Salva o usuário no banco de dados
        return "redirect:/login"; // Redireciona para o login após cadastrar
    }
}