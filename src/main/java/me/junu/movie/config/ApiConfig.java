package me.junu.movie.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * packageName    : me.junu.movie.config
 * fileName       : ApiConfig
 * author         : JUNU
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08        JUNU       최초 생성
 */
@Configuration
public class ApiConfig {

    @Value("${movie.api.key}")
    private String apiKey;

    @Value("${daily.boxoffice.url}")
    private String dailyBoxOfficeUrl;

    @Value("${weekly.boxoffice.url}")
    private String weeklyBoxOfficeUrl;

    @Value("${movie.list.url}")
    private String movieListUrl;

   @Value("${movie.info.url}")
    private String movieInfoUrl;

    public String getApiKey() {
        return apiKey;
    }

    public String getDailyBoxOfficeUrl() {
        return dailyBoxOfficeUrl;
    }

    public String getWeeklyBoxOfficeUrl() {
        return weeklyBoxOfficeUrl;
    }

    public String getMovieListUrl() {
        return movieListUrl;
    }

    public String getMovieInfoUrl() {
        return movieInfoUrl;
    }
}
