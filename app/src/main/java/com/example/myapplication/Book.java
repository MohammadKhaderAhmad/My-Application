package com.example.myapplication;

public class Book {
    private String title;
    private String author;
    private String catogery;

    public Book(){

    }

    public Book(String title, String author, String catogery) {
        this.title = title;
        this.author = author;
        this.catogery = catogery;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatogery() {
        return catogery;
    }

    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }
}
