package dev.bug.webflux_essentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WebfluxEssentialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxEssentialsApplication.class, args);
    }

}
