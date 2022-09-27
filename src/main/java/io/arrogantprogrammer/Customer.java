package io.arrogantprogrammer;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Customer extends PanacheEntity {

    String email;

    String firstName;

    String lastName;

    CustomerStatus customerStatus;

    static Customer createFromValues(CustomerRecord customerRecord) {

        Customer customer = new Customer();
        customer.email = customerRecord.email();
        customer.firstName = customerRecord.firstName();
        customer.lastName = customerRecord.lastName();

        if (customer.getFirstName().equals("Jeremy")){
            customer.customerStatus = CustomerStatus.VIP;
        }else if(customer.getFirstName().equals("Robert")){
            customer.customerStatus = CustomerStatus.NOT_THAT_GUY_AGAIN;
        }

        return customer;
    }
    CustomerRecord toCustomerRecord() {
        return new CustomerRecord(this.id, this.email, this.firstName, this.lastName);
    }


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
