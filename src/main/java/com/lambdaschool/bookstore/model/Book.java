package com.lambdaschool.bookstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


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

    @OneToMany(mappedBy = "book")
    private Set<Section> sections = new HashSet<>();

    @ManyToMany(mappedBy = "books")
//    @JsonIgnoreProperties("books")
    private Set<Author> authors = new HashSet<>();

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

    public Set<Section> getSections()
    {
        return sections;
    }

    public void setSections(Set<Section> sections)
    {
        this.sections = sections;
    }

    public Set<Author> getAuthors()
    {
        return authors;
    }

    public void setAuthors(Set<Author> authors)
    {
        this.authors = authors;
    }
}
