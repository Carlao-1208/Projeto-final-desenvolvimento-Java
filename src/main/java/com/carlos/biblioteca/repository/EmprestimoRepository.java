package com.carlos.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.biblioteca.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
