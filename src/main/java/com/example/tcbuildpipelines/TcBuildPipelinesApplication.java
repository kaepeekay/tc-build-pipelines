package com.example.tcbuildpipelines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TcBuildPipelinesApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TcBuildPipelinesApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TcBuildPipelinesApplication.class, args);
    }

}
