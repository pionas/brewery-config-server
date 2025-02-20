package pl.excellentapp.brewery.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BreweryConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreweryConfigServerApplication.class, args);
    }

}
