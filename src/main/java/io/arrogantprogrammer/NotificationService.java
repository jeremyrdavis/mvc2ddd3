package io.arrogantprogrammer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

    void customerAdded(CustomerRecord customerRecord) {

        LOGGER.info("Added a new customer: {}", customerRecord);
    }
}
