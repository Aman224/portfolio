package com.cloud.portfolio.home;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class HomeRepository {


    Home home;

    Home find() {
        return home;
    }

    @PostConstruct
    private void init() {
        home = new Home("Aman", "178 Burley Road", "07767977124", "linkedin", "github", "description", "cv", new Date());
    }

}
