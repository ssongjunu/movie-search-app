package me.junu.movie.controller;

import me.junu.movie.config.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : me.junu.movie.controller
 * fileName       : MovieController
 * author         : JUNU
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08        JUNU       최초 생성
 */
@Controller
public class MovieController {

    private final ApiConfig apiConfig;

    @Autowired
    public MovieController(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }
}
