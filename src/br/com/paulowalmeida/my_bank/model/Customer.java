package br.com.paulowalmeida.my_bank.model;

public class Customer {
    private String firstName;
    private String lastName;
    private String cpf;
    private String rg;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String cpf, String rg) {
        setFirstName(firstName);
        setLastName(lastName);
        setCpf(cpf);
        setRg(rg);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void showInfoCustomer() {
        System.out.println("Cliente: " + firstName + " " + lastName);
        System.out.println("Rg: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
