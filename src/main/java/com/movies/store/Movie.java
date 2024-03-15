package com.movies.store;

public class Movie {
    private int id;
    private String name;

    public Movie(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    //Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
