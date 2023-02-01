package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;

public class DepositAccount extends Account {
    public DepositAccount(Customer customer) {
        super(customer);
    }

    @Override
    public boolean withdrawal(double value) {
        return false;
    }

    @Override
    public boolean transfer(Account destinationAccount, double value) {
        return false;
    }
}
