package com.carlos.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
