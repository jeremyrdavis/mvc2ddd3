package io.arrogantprogrammer;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Customer extends PanacheEntity {

    String email;

    String firstName;

    String lastName;

    CustomerStatus customerStatus;

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }
}
