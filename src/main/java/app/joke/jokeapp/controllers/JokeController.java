package app.joke.jokeapp.controllers;

import app.joke.jokeapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
    private JokesService jokesService;

    public JokeController(JokesService jokesService)
    {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model)
    {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
