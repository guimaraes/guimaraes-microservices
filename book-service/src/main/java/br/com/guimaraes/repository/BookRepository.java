package br.com.guimaraes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guimaraes.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}