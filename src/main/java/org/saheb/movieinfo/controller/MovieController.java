package org.saheb.movieinfo.controller;

import org.saheb.movieinfo.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
	/*@Value("${api.key}")
    private String apiKey;*/

   /* @Autowired
    private RestTemplate restTemplate;*/

    @RequestMapping(value = "/{movieId}", method = RequestMethod.GET)
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
    	System.out.println("inside movie-info");
        //MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
        //return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    	return new Movie(movieId, "Transformer", "Test");

    }
}
