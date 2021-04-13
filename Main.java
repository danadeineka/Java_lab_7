package com.company;

public class Main {

    public static void main(String[] args) {
        InvestmentCompany Berkshire_Partners = new InvestmentCompany();
        InvestmentCompany Brentwood_Associates = new InvestmentCompany("London", 100, 300000, "UK");
        InvestmentCompany Accel_KKR = new InvestmentCompany("Miami",  200, 1000000, "USA", "Accel-KKR", 55, "DAMA", "Hight", "Accel-KKR@gmail.org", 338545455);

        System.out.println(Berkshire_Partners.toString());
        System.out.println(Brentwood_Associates.toString());
        System.out.println(Accel_KKR.toString());
        System.out.println("---------------------------------------------");

        InvestmentCompany.setYearOfFoundation(1960);

        Berkshire_Partners.printStaticYearOfFoundation();
        Berkshire_Partners.printYearOfFoundation();
    }
}