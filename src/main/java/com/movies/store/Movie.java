package com.movies.store;

public class Movie {
    private int id;
    private String name;
    private int year;
    private String director;
    private String genre;
    private String description;


    public Movie(int id, String name, int year, String director, String genre, String description){
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.description = description;
    }
    
    //Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getDecription() {
        return description;
    }


}
