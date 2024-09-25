package utils;

import domain.Customer;

public class CustomerUtil {
    public static Customer createSampleCustomer() {
        return new Customer("John Doe", "123 Main St", "555-1234");
    }
}

