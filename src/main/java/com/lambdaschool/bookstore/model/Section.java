package com.lambdaschool.bookstore.model;

import javax.persistence.*;

@Entity
@Table (name = "sections")
public class Section
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // fields
    private long section;
    private String name;

    //TODO Setup ManyToOne with Book

    public Section()
    {
        // default constructor
    }

    //TODO Setup Getters/Setters
}
