package com.springcloud.server.repositories;

import com.springcloud.server.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Optional<Book> findById(Long bookId);

    void deleteById(Long bookId);
}
