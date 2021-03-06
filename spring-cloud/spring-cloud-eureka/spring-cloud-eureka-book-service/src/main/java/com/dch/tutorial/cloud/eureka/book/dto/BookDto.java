package com.dch.tutorial.cloud.eureka.book.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

/**
 * DTO class used for Book with rate details data transfer process.
 *
 * @author David.Christianto
 */
@JsonInclude(Include.NON_NULL)
public class BookDto {

    private String author;
    private String title;
    private List<RatingDto> rates;

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

    /**
     * @return the rates
     */
    public List<RatingDto> getRates() {
        return rates;
    }

    /**
     * @param rates the rates to set
     */
    public void setRates(List<RatingDto> rates) {
        this.rates = rates;
    }

}
