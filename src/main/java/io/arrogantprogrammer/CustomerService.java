package io.arrogantprogrammer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    @Inject
    CustomerRepository customerRepository;

    CustomerRecord createCustomer(CustomerRecord customerRecord) {

        Customer customer = Customer.createFromValues(customerRecord);
        customerRepository.persist(customer);
        return customer.toCustomerRecord();
    }

    public List<CustomerRecord> listAll() {

        return customerRepository.listAll().stream().map(customer -> {
            return customer.toCustomerRecord();
        }).collect(Collectors.toList());
    }
}
