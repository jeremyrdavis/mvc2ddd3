package io.arrogantprogrammer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/customers")
public class CustomerResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResource.class);

    @Inject
    CustomerService customerService;

    @POST@Transactional
    public CustomerRecord addCustomer(CustomerRecord customerRecord) {

        CustomerRecord result = customerService.createCustomer(customerRecord);
        return result;
    }

    @GET
    public List<CustomerRecord> allCustomers() {

        return customerService.listAll();
    }
}
