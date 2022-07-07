package com.bulvee.strategy.service;

import com.bulvee.strategy.model.Customer;

public class InsuranceProposal {


    private Customer customer;
    private InsurancePremiumCalculator insurancePremiumCalculator;
    private double vehicleValue;

    public InsuranceProposal(Customer customer, InsurancePremiumCalculator insurancePremiumCalculator, double vehicleValue) {
        this.customer = customer;
        this.insurancePremiumCalculator = insurancePremiumCalculator;
        this.vehicleValue = vehicleValue;
    }

    public InsuranceProposal(Customer customer) {
        this.customer = customer;
    }

    public String generate() {
        return "Proposal genereted for " + customer.getName() + "\n"
                + "Age:" + customer.getAge() + "\n"
                + "Gender:" + customer.getGender() + "\n"
                + "Premium value calculeted: " + insurancePremiumCalculator.calculate(this.customer, vehicleValue) + "\n\n\n";
    }

    public InsurancePremiumCalculator getInsurancePremiumCalculator() {
        return insurancePremiumCalculator;
    }

    public void setInsurancePremiumCalculator(InsurancePremiumCalculator insurancePremiumCalculator) {
        this.insurancePremiumCalculator = insurancePremiumCalculator;
    }

    public double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

}
