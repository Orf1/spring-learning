package dev.orf1.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringLearningApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearningApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringLearningApplication.class);

        ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

        LOGGER.info("componentDAO instance: {}", componentDAO);

        context.close();
    }
}
