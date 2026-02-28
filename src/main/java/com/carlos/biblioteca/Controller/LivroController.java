package com.carlos.biblioteca.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.carlos.biblioteca.service.LivroService;
import com.carlos.biblioteca.model.Livro;


@Controller
@RequestMapping("/livros")
public class LivroController {


    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("livros", service.listarTodos());
        return "livros";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("livro", new Livro());
        return "formLivro";
    }

    @PostMapping
    public String salvar(@ModelAttribute Livro livro) {
        service.salvar(livro);
        return "redirect:/livros";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletar(id);
        return "redirect:/livros";
    }

}
