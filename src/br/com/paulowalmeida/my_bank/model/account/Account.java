package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;

public abstract class Account {
    private String number;
    private String agency;
    private Customer customer;
    private double balance;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public Account(Customer customer, String agency, String number, double balance) {
        this.customer = customer;
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdrawal(double value, Double tax) throws InsufficientBalanceException {
        if(balance < (value + tax)) {
            throw new InsufficientBalanceException("Operação não pode ser realizada: Saldo inferior ao valor solicitado. Saldo: " + balance + ", valor: " + value);
        }

        balance -= value;
    };

    public abstract void transfer(Account destinationAccount, double value);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void showInfoAccount() {
        customer.showInfoCustomer();
        System.out.println("Agência: " + agency);
        System.out.println("Número: " + number);
        System.out.println("Saldo: " + balance);
        System.out.println();
    }
}
