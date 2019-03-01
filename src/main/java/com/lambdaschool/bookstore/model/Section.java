package com.lambdaschool.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne
    @JoinColumn(name = "bookid")
    @JsonIgnore
    private Book book;

    public Section()
    {
        // default constructor
    }

    // getters & setters -----------------------------------------------
    public long getSection()
    {
        return section;
    }

    public void setSection(long section)
    {
        this.section = section;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Book getBook()
    {
        return book;
    }

    public void setBook(Book book)
    {
        this.book = book;
    }
}
