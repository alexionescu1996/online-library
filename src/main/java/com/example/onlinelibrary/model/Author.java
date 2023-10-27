package com.example.onlinelibrary.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Comparator;
import java.util.Date;

@Entity
@Table(name = "Authors")
@Data
public class Author implements Comparable<Author> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String bio;
    private Date birthDate;

    @Override
    public int compareTo(Author o) {
        int result = this.getFirstName().compareTo(o.getFirstName());
        if (result != 0) return result;
        return this.getLastName().compareTo(o.getLastName());
    }

}

