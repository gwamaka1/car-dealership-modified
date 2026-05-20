package com.pluarsight;

public abstract class Contract {
    private String date;
    private String name;
    private String email;
    private Vehicle vehicalSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, double monthlyPayment, Vehicle  vehicalSold, double totalPrice, String email, String name) {
        this.date = date;
        this.monthlyPayment = monthlyPayment;
        this.vehicalSold = vehicalSold;
        this.totalPrice = totalPrice;
        this.email = email;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }


    public void setPrice(double price) {
        this.totalPrice = totalPrice;
    }

    public Vehicle getVehicalSold() {
        return vehicalSold;
    }

    public void setVehicalSold(Vehicle vehicalSold) {
        this.vehicalSold = vehicalSold;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double getMonthlyPayment();
    abstract double getTotalPrice();



}
