package com.cloud.portfolio.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

    private static final Logger log = LoggerFactory.getLogger(HomeRepository.class);
    private final JdbcClient jdbcClient;

    @Autowired
    public HomeRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Home find() {
        return jdbcClient
                .sql("SELECT * FROM home")
                .query(Home.class)
                .single();
    }
}
