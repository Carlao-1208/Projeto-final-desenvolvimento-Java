package com.carlos.biblioteca.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.carlos.biblioteca.repository.LivroRepository;
import com.carlos.biblioteca.model.Livro;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public void salvar(Livro livro) {
        repository.save(livro);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
