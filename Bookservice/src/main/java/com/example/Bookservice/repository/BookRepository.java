package com.example.Bookservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bookservice.models.Book;



public interface BookRepository extends JpaRepository<Book, Long> {
}