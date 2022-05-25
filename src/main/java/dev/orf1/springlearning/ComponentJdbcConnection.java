package dev.orf1.springlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
    Logger logger = LoggerFactory.getLogger(ComponentJdbcConnection.class);

    public ComponentJdbcConnection() {
        System.out.println("JDBC Connection Initialized");

        logger.info("onConstruct {}", this);
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
