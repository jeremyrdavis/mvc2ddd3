package io.arrogantprogrammer;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.LockModeType;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

}
