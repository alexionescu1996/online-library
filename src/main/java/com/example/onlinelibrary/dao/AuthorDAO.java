package com.example.onlinelibrary.dao;

import com.example.onlinelibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {


}
