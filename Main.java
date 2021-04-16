package com.company;

public class Main {

    public static void main(String[] args) {
        InvestmentCompany alpineInvestors = new InvestmentCompany();
        InvestmentCompany frontierCapital = new InvestmentCompany("London", 100, "USA", "UK");
        InvestmentCompany genesisPark = new InvestmentCompany("Miami",  200, "USA", "USA",
                "Genesis Park", 55, "DAMA", "Hight", "genesispark@gmail.org", 338545455);

        System.out.println(alpineInvestors.toString());
        System.out.println(frontierCapital.toString());
        System.out.println(genesisPark.toString());
        System.out.println("---------------------------------------------");


        alpineInvestors.printStaticYearOfFoundation();
        alpineInvestors.printYearOfFoundation();
    }
}