package com.nestdigital.librarybackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library_tb")
public class LibraryModel {

    @Id
    @GeneratedValue
    public int Id;
    public String name;
    public String author;
    public String rDate;
    public int stock;

    public LibraryModel(int id, String name, String author, String rDate, int stock) {
        Id = id;
        this.name = name;
        this.author = author;
        this.rDate = rDate;
        this.stock = stock;
    }

    public LibraryModel() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
