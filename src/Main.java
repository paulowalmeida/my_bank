import br.com.paulowalmeida.my_bank.model.Customer;
import br.com.paulowalmeida.my_bank.model.LifeInsurance;
import br.com.paulowalmeida.my_bank.model.account.CheckingAccount;
import br.com.paulowalmeida.my_bank.model.income_tax.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Samuel", "Winchester", "000.111.222-33", "1234567");
        Customer customer2 = new Customer("Robert", "Singer", "999.888.777-66", "7654321");

        CheckingAccount checkingAccount1 = new CheckingAccount(customer1, "1234", "56789-0", 1000.0);
        CheckingAccount checkingAccount2 = new CheckingAccount(customer2, "1234", "56789-0", 2000.0);

        System.out.println("Contas ativas");
        System.out.println("-------------");
        checkingAccount1.showInfoAccount();
        checkingAccount2.showInfoAccount();

        try {
            System.out.println("Tentando realizar transferencia de:");
            System.out.println("Remetente: " + checkingAccount1.getCustomer().getFirstName() + " " + checkingAccount1.getCustomer().getLastName());
            System.out.println("Destinatario: " + checkingAccount2.getCustomer().getFirstName() + " " + checkingAccount2.getCustomer().getLastName());
            System.out.println("Valor: " + 3000.0);
            System.out.println();
            checkingAccount1.transfer(checkingAccount2, 3000.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        checkingAccount1.showInfoAccount();
        checkingAccount2.showInfoAccount();

        System.out.println();
        System.out.println("Verificando a taxação das contas...");
        System.out.println();

        LifeInsurance lifeInsurance = new LifeInsurance();
        TaxCalculator taxCalculator = new TaxCalculator();

        taxCalculator.register(checkingAccount1);
        taxCalculator.register(checkingAccount2);
        taxCalculator.register(lifeInsurance);

        System.out.println("Processando...");

        System.out.println("O total de taxação de imposto é: " + taxCalculator.getTotalizer());
    }
}