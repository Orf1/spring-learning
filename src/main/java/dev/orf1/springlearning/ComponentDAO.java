package dev.orf1.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComponentDAO {
    ComponentJdbcConnection componentJdbcConnection;
    Logger logger = LoggerFactory.getLogger(ComponentDAO.class);

    @Autowired
    public ComponentDAO(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;

        logger.info("onConstruct {}", this);
        System.out.println("Injected JdbcConnection! " + componentJdbcConnection);
    }

    @PostConstruct
    public void onPostConstruct() {
        logger.info("onPostConstruct {}", this);
    }

    @PreDestroy
    public void onPreDestroy() {
        logger.info("onPreDestroy {}", this);
    }
}
