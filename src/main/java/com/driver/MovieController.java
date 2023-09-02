package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add-movie")
  public ResponseEntity<String> addMovie (@RequestBody Movie movie){
         movieService.addMovie(movie);
         return new ResponseEntity<>("Success", HttpStatus.CREATED);
  }

  @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        movieService.addDirector(director);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
  }

  @PutMapping("/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie") String movie,@RequestParam("director") String director){
        movieService.addMovieDirectorPair(movie,director);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
  }

  @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name){
      Movie movie =  movieService.getMovieByName(name);
        return new ResponseEntity<>(movie,HttpStatus.FOUND);
  }

  @GetMapping("/get-director-by-name/{name}")
  public ResponseEntity<Director> getDirectorByName(@PathVariable("name") String name){
       Director director= movieService.getDirectorByName(name);
      return new ResponseEntity<>(director,HttpStatus.CREATED);
  }

  @GetMapping("/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable("director") String name){
        List<String> movie = movieService.getMoviesByDirectorName(name);
        return new ResponseEntity<>(movie,HttpStatus.FOUND);
  }

  @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> movie = movieService.findAllMovies();
        return new ResponseEntity<>(movie,HttpStatus.CREATED);
  }

  @DeleteMapping("/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam("name") String name){
        movieService.deleteDirectorByName(name);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
  }

  @DeleteMapping("/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        movieService.deleteAllDirectors();
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
  }
}
