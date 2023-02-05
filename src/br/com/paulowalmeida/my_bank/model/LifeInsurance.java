package br.com.paulowalmeida.my_bank.model;

import br.com.paulowalmeida.my_bank.model.income_tax.Taxable;

public class LifeInsurance implements Taxable {
    @Override
    public double getTaxAmount() {
        return 50.0;
    }
}
