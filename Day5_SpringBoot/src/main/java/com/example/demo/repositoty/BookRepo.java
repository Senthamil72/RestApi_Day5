package com.example.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
