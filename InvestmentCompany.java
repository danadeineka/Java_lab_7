package com.company;

public class InvestmentCompany {
    private String address;
    private int investments;
    private int capital;

    private String country;
    private String name;
    private int employees;
    private String founder;
    private String reliability;

    private static int yearOfFoundation;

    protected String email;
    protected int phone_number;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInvestments() {
        return investments;
    }

    public void setInvestments(int investments) {
        this.investments = investments;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public static int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public static void setYearOfFoundation(int yearOfFoundation) {
        InvestmentCompany.yearOfFoundation = yearOfFoundation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public InvestmentCompany() {}

    public InvestmentCompany(String address, int investments, int capital, String country) {
        this.address = address;
        this.investments = investments;
        this.capital = capital;
        this.country = country;
    }

    public InvestmentCompany(String address, int investments, int capital, String country, String name, int employees, String founder, String reliability, String email, int phone_number) {
        this.address = address;
        this.investments = investments;
        this.capital = capital;
        this.country = country;
        this.name = name;
        this.employees = employees;
        this.founder = founder;
        this.reliability = reliability;
        this.email = email;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "InvestmentCompany\n" +
                "address='" + address + '\'' +
                ", investments=" + investments +
                ", capital=" + capital +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                ", founder='" + founder + '\'' +
                ", reliability='" + reliability + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number ;
    }

    public void printStaticYearOfFoundation() { System.out.println(yearOfFoundation);}

    public void printYearOfFoundation(){ System.out.println(yearOfFoundation);}

    public void resetValues(String address, int investments, int capital, String country, String name, int employees, String founder, String reliability, String email, int phone_number) {
        this.address = address;
        this.investments = investments;
        this.capital = capital;
        this.country = country;
        this.name = name;
        this.employees = employees;
        this.founder = founder;
        this.reliability = reliability;
        this.email = email;
        this.phone_number = phone_number;
    }


}