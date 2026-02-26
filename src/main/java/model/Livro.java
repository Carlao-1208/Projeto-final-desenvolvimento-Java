package model;
import jakarta.persistence.*;

@Entity
public class Livro {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String isbn;
    private Integer ano;

    public Livro() {}

    // getters e setters
}

