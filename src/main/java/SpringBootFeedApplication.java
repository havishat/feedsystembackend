//package java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "feed")
public class SpringBootFeedApplication {
    public static void main(String args[]) {
        SpringApplication.run(SpringBootFeedApplication.class, args
        );
    }
}
