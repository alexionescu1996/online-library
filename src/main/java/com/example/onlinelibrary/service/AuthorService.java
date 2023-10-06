package com.example.onlinelibrary.service;

import com.example.onlinelibrary.dao.AuthorDAO;
import com.example.onlinelibrary.model.Author;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
// enables constructor injection, will generate a constructor at compile time
public class AuthorService {

    //    a proxy class will implement authorDAO interface and will have predefined methods
    private final AuthorDAO authorDAO;

    @Transactional
    public List<Author> findAll() {
        return authorDAO.findAll();
    }

}
