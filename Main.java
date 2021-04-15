package com.company;

public class Main {

    public static void main(String[] args) {
        InvestmentCompany company1 = new InvestmentCompany();
        InvestmentCompany company2 = new InvestmentCompany("London", 100, 300000, "UK");
        InvestmentCompany company3 = new InvestmentCompany("Miami",  200, 1000000, "USA",
                "Accel-KKR", 55, "DAMA", "Hight", "Accel-KKR@gmail.org", 338545455);

        System.out.println(company1.toString());
        System.out.println(company2.toString());
        System.out.println(company3.toString());
        System.out.println("---------------------------------------------");

        InvestmentCompany.setYearOfFoundation(1960);
        company1.printStaticYearOfFoundation();
        company1.printYearOfFoundation();
    }
}