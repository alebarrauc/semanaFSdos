package com.movies.store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//
@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();
    
   public MovieController(){
        movies.add(new Movie(1, "Cloud Atlas", 2012, "Wachoski Brother","SCI-FI,SPIRITUAL","Set of several stories that take place in the past, present and future."));
        movies.add(new Movie(2, "Dark City", 1998, "Alex Proyas","SCI-FI,Fantastic, neo-noir","A man struggles with memories of his past."));
        movies.add(new Movie(3, "The Terminator", 1984, "James Cameron","Terror, Sci-Fi","The movie is about the future battle between the artificial intelligence program Skynet and humanity.."));
    }


@GetMapping("/movies")
public List<Movie> getMovies(){
    return movies;
}
}