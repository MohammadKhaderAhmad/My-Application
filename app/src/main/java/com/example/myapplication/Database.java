package com.example.myapplication;

import java.util.ArrayList;

public class Database {
    private ArrayList<Book> books = new ArrayList<>();

    public Database(){
        books.add(new Book("Software Engineeiring", "Mohammad Khader", "Software Engineeiring"));
        books.add(new Book("Testing", "Mahmoud Hamdan", "Programming"));
        books.add(new Book("Java", "Osaid Hamza", "Programming"));

    }

    public ArrayList<Book> TheBooks (String category){
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books ){
            if(b.getCatogery().equals(category)){
                result.add(b);
            }
        }
        return result;
    }
}
