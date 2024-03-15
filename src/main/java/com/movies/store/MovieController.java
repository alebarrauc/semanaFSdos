package com.movies.store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//
@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();
    
   public MovieController(){
        movies.add(new Movie(1, "cloud atlas"));
   }


@GetMapping("/movies")
public List<Movie> getMovies(){
    return movies;
}
}