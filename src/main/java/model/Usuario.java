package model;
import jakarta.persistence.*;

@Entity
public class Usuario {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    public Usuario() {}

    // getters e setters

}
