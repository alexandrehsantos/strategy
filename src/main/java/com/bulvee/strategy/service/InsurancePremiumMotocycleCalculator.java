package com.bulvee.strategy.service;

import com.bulvee.strategy.model.Customer;

public class InsurancePremiumMotocycleCalculator implements InsurancePremiumCalculator {

    @Override
    public double calculate(Customer customer, double vehicleValue) {
        double motocycleDefaultTAX = 0.5;
        if (customer.getAge() > 60) {
            motocycleDefaultTAX = 0.0;
        }
        return (motocycleDefaultTAX + 0.1) * vehicleValue;
    }
}
