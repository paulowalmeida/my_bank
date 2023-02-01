package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;

public abstract class Account {
    private String number;
    private String agency;
    private Customer customer;
    protected double balance;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public abstract boolean withdrawal(double value);

    public abstract boolean transfer(Account destinationAccount, double value);

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}
