package com.lambdaschool.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table (name = "books")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // fields
    private long bookid;
    private String title;
    private String isbn;
    private int copy;

//    @ManyToMany
//    @JoinTable(name = "wrote",
//            joinColumns = {@JoinColumn(name = "bookid")},
//            inverseJoinColumns = {@JoinColumn(name = "authorid")})
//    @JsonIgnoreProperties("authors")
//    private Set<Author> authors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "sectionid")
    @JsonIgnoreProperties("books")
    private long sectionid;

    public Book()
    {
        // default constructor
    }

    // getters & setters--------------------------------------------------
    public long getBookid()
    {
        return bookid;
    }

    public void setBookid(long bookid)
    {
        this.bookid = bookid;
    }

    public String getBookTitle()
    {
        return title;
    }

    public void setBooktitle(String booktitle)
    {
        this.title = booktitle;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getCopy()
    {
        return copy;
    }

    public void setCopy(int copy)
    {
        this.copy = copy;
    }
}
