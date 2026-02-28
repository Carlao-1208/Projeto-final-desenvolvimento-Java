package com.carlos.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.biblioteca.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
