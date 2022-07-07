package com.bulvee.strategy.service;

import com.bulvee.strategy.model.Customer;

public class InsurancePremiumCarCalculator implements InsurancePremiumCalculator {

    @Override
    public double calculate(Customer customer, double vehicleValue) {
        double carDefaultTAX = 0.3;
        if (customer.getAge() > 60) {
            carDefaultTAX = 0.0;
        }
        return (carDefaultTAX + 0.1) * vehicleValue;
    }
}
