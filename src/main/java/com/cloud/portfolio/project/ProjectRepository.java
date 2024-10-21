package com.cloud.portfolio.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository {

    private static final Logger log = LoggerFactory.getLogger(ProjectRepository.class);
    private final JdbcClient jdbcClient;

    @Autowired
    public ProjectRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Project> findAll() {
        return jdbcClient
                .sql("SELECT * FROM Projects")
                .query(Project.class)
                .list();
    }
}
