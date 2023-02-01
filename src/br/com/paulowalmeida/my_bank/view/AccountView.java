package br.com.paulowalmeida.my_bank.view;

import br.com.paulowalmeida.my_bank.model.Customer;
import br.com.paulowalmeida.my_bank.model.account.Account;

public class AccountView {

    public static void showInfoAccount(Account account) {
        showInfoCustomer(account.getCustomer());
        System.out.println("Agência: " + account.getAgency());
        System.out.println("Número: " + account.getNumber());
    }

    private static void showInfoCustomer(Customer customer) {
        System.out.println("Cliente: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Rg: " + customer.getRg());
        System.out.println("CPF: " + customer.getCpf());
    }
}
