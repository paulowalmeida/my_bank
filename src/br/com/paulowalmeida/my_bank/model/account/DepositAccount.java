package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;

public class DepositAccount extends Account {
    public DepositAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void withdrawal(double value, Double tax) throws InsufficientBalanceException {
        double valueWithTax = value + (tax.equals(null) ? 0.1 : tax);
        super.withdrawal(valueWithTax, null);
    }

    @Override
    public void transfer(Account destinationAccount, double value) throws InsufficientBalanceException {
        this.withdrawal(value, 5.0);
        destinationAccount.deposit(value);
    }
}
