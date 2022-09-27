package io.arrogantprogrammer;

import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class KafkaResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaResource.class);

    @Inject
    CustomerService customerService;

    @Incoming("customers") @Blocking @Transactional
    public void onCustomerAdded(CustomerRecord customerRecord) {

        customerService.createCustomer(customerRecord);
    }
}
