package guru.springframework.chucknorrisjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String generateJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
