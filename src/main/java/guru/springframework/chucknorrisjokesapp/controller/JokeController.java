package guru.springframework.chucknorrisjokesapp.controller;

import guru.springframework.chucknorrisjokesapp.service.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeServiceImpl jokeService;

    public JokeController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.generateJoke());
        return "index";
    }
}
