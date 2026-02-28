package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.biblioteca.BibliotecaApplication;

import model.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long>{

}
