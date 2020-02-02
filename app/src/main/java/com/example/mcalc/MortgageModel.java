package com.example.mcalc;

public class MortgageModel {

    private double principle;
    private double amor;
    private double interest;

    public MortgageModel (String p, String a, String i)
    {
        this.principle = Double.parseDouble(p);
        this.amor = Double.parseDouble(a);
        this.interest = Double.parseDouble(i);
    }

    public String computePayment()
    {
        double P = this.principle;
        double r = (this.interest / 100) / 12;
        double n = this.amor * 12;

        double index = (r*P) / (1 - Math.pow(1 + r,-n));
        String result = String.format("$%,.2f", index);
        return result;
    }
}
