package com.pluarsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private final int recordingFee;
    private int processingFee;
    private boolean finance;


    public SalesContract(String date, double monthlyPayment, Vehicle vehicalSold, double totalPrice, String email, String name, boolean finance) {
        super(date, monthlyPayment, vehicalSold, totalPrice, email, name);
        this.salesTaxAmount = vehicalSold.getPrice() * 0.05;
        this.recordingFee = 100;
        this.processingFee = vehicalSold.getPrice() < 10000? 295:495;
        this.finance = finance;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public boolean isFinance() {
        return finance;

    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    @Override
    double getMonthlyPayment() {
        double rate;
        int months;

        if (isFinance()) {
            if (getVehicalSold().getPrice() >= 10000) {
                 rate = 0.0425;
               months = 48;
            } else {
                 rate = 0.0525;
                 months = 24;
            }
            return (getTotalPrice() * (1 + rate)) / months;


        }
        else{
            return 0;
        }

    }

    @Override
    double getTotalPrice() {
        return salesTaxAmount + processingFee+ recordingFee+ getVehicalSold().getPrice();
    }
    /*
    Sales Tax Amount (5%)
• Recording Fee ($100)
• Processing fee ($295 for vehicles under $10,000 and $495 for all others
• Whether they want to finance (yes/no)
• Monthly payment (if financed) based on:
• All loans are at 4.25% for 48 months if the price is $10,000 or more
• Otherwise they are at 5.25% for 24 month
     */
}
