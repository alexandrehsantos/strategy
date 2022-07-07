package com.bulvee.strategy;

import com.bulvee.strategy.model.Customer;
import com.bulvee.strategy.model.Gender;
import com.bulvee.strategy.model.VehicleType;
import com.bulvee.strategy.service.InsuranceProposal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        customer.setName(scanner.nextLine());

        System.out.println("Age:");
        customer.setAge(scanner.nextInt());

        System.out.println("Gender 1-MALE 2-FEMALE:");
        Gender gender = Gender.values()[scanner.nextInt() - 1];
        customer.setGender(gender);

        InsuranceProposal insuranceProposal = new InsuranceProposal(customer);

        boolean continueRegister = true;

        while (continueRegister) {
            System.out.println("Vehicle type: 1-CAR 2-MOTOCYCLE:");
            VehicleType vehicleType = VehicleType.values()[scanner.nextInt() - 1];

            insuranceProposal.setInsurancePremiumCalculator(vehicleType.getInsurancePremiumCarCalculator());

            System.out.println("Vehicle Value:");
            Double vehicleValue = scanner.nextDouble();
            insuranceProposal.setVehicleValue(vehicleValue);

            System.out.println("Press 1 to proposal for other vehicle or press 0 to finish:");
            int continueOption = scanner.nextInt();
            continueRegister = continueOption == 1 ? true : false;
            System.out.println(insuranceProposal.generate());
        }
    }
}
