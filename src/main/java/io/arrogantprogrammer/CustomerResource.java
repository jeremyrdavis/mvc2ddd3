package io.arrogantprogrammer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/customers")
public class CustomerResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResource.class);

    @POST@Transactional
    public Customer addCustomer(CustomerRecord customerRecord) {

        Customer customer = Customer.createFromValues(customerRecord);
        customer.persist();
        return customer;
    }

    @GET
    public List<Customer> allCustomers() {

        return Customer.listAll();
    }
}
