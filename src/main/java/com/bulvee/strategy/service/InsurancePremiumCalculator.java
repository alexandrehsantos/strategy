package com.bulvee.strategy.service;

import com.bulvee.strategy.model.Customer;

public interface InsurancePremiumCalculator {

    double calculate(Customer customer, double vehicleValue);

}
