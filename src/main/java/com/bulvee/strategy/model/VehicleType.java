package com.bulvee.strategy.model;

import com.bulvee.strategy.service.InsurancePremiumCalculator;
import com.bulvee.strategy.service.InsurancePremiumCarCalculator;
import com.bulvee.strategy.service.InsurancePremiumMotocycleCalculator;

public enum VehicleType {

    CAR{
        @Override
        public InsurancePremiumCalculator getInsurancePremiumCarCalculator() {
            return new InsurancePremiumCarCalculator();
        }
    },
    MOTOCYCLE {
        @Override
        public InsurancePremiumCalculator getInsurancePremiumCarCalculator() {
            return new InsurancePremiumMotocycleCalculator();
        }
    };

    public abstract InsurancePremiumCalculator getInsurancePremiumCarCalculator();


}
