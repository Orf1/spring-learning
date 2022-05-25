package dev.orf1.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearningApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringLearningApplication.class, args);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
    }
}
