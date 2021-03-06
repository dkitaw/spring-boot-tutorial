package com.dch.tutorial.cloud.eureka.book.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The entity used to provide data about the Book and represent the columns in
 * the database.
 *
 * @author David.Christianto
 */
@Entity
@Table(name = "book")
public class BookEntity implements Serializable {

    private static final long serialVersionUID = -7969327742985760595L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
