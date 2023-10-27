package com.example.onlinelibrary.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "Genres")
@Data
public class Genre implements Comparable<Genre> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private Set<Book> books;


    @Override
    public int compareTo(Genre o) {
        return this.getName().compareTo(o.getName());
    }
}
