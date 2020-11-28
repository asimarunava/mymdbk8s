package com.vortexmind.mymdb;

import com.vortexmind.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class HelloWorldController {

    @GetMapping
    public List<Movie> getMovies()
    {
        List<Movie> arr = new ArrayList<>();
        arr.add(new Movie("1", "Iron Man", "2003"));
        arr.add(new Movie("2", "Iron Man 2", "2004"));
        arr.add(new Movie("3", "Iron Man 3", "2005"));
        return arr;
    }
}