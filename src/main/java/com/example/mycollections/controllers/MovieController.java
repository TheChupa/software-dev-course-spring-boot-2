package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movie = new ArrayList<>(){{
        add(new Movie("Attack of the Clones", " George Lucas", 2002, 144));
        add(new Movie("Spaceballs", "Mel Brooks", 1987, 96));
        add(new Movie("Men in Black", "Barry Sonnenfeld", 1997, 98));
    }};
    @GetMapping("/json")
    public List<Movie> getMovieJson() {return movie;}

    @GetMapping("/html")
    public String getMusicHtml() {
        String movieList = "<ul>";
        for(Movie film : movie){
            movieList += "<li>" + film + "</li>";
        }
        movieList += "</ul>";


        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """
                +
                movieList +
                """
                        </ul>
                    </body>
                    """;
    }
}



