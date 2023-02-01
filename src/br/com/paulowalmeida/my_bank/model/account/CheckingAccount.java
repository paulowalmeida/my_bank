package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;

public class CheckingAccount extends Account implements Taxable {

    public CheckingAccount(Customer customer) {
        super(customer);
    }

    @Override
    public boolean transfer(Account destinationAccount, double value) {
        double valueWithTax = value + 0.1;

        if (this.withdrawal(valueWithTax)) {
            destinationAccount.deposit(value);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdrawal(double value) {
        double valueWithTax = value + 0.1;
        if (this.balance < valueWithTax) {
            return false;
        }

        this.balance -= value;
        return true;
    }
}
