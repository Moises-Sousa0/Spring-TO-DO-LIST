package br.com.giuliana.desafio_todolist.repository;

import br.com.giuliana.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
