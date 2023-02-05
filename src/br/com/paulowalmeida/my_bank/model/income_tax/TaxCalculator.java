package br.com.paulowalmeida.my_bank.model.income_tax;

public class TaxCalculator {
    private double totalizer;

    public void register(Taxable taxable) {
        totalizer += taxable.getTaxAmount();
    }

    public double getTotalizer() {
        return totalizer;
    }
}
