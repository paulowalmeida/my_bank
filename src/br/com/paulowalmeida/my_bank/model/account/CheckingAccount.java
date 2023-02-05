package br.com.paulowalmeida.my_bank.model.account;

import br.com.paulowalmeida.my_bank.model.Customer;
import br.com.paulowalmeida.my_bank.model.income_tax.Taxable;

public class CheckingAccount extends Account implements Taxable {

    public CheckingAccount(Customer customer, String agency, String number, double balance) {
        super(customer, agency, number, balance);
    }

    @Override
    public void transfer(Account destinationAccount, double value) throws InsufficientBalanceException {
        this.withdrawal(value, 0.1);
        destinationAccount.deposit(value);
    }

    @Override
    public void withdrawal(double value, Double tax) throws InsufficientBalanceException {
        double valueWithTax = value + (tax.equals(null) ? 0.1 : tax);
        super.withdrawal(value, tax);
    }

    @Override
    public double getTaxAmount() {
        return super.getBalance() * 0.01;
    }
}
