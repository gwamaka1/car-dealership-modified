package com.pluarsight;

public class LeaseContract extends Contract {
    private double endingExpectedValue;
    private double leaseFee;


    public LeaseContract(String date,  Vehicle vehicalSold, String email, String name) {
        super(date,  vehicalSold, email, name);
        this.endingExpectedValue = .5*vehicalSold.getPrice();
        this.leaseFee = .07* vehicalSold.getPrice() ;
    }
    public double getEndingExpectedValue() {
        return endingExpectedValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }



    @Override
    double getTotalPrice() {
        return getVehicalSold().getPrice()-endingExpectedValue+ leaseFee;
    }

    @Override
    double getMonthlyPayment() {
        double rate = .04;
        int months = 36;
        return getTotalPrice()/36 * (1+rate);
    }
}


