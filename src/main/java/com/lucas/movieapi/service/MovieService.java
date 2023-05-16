package com.lucas.movieapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.movieapi.model.Movie;
import com.lucas.movieapi.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public List<Movie> findAllMovies(){   
       return movieRepository.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId){
       return movieRepository.findMovieByImdbId(imdbId);
    }
}
