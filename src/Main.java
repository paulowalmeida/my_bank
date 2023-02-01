import br.com.paulowalmeida.my_bank.model.Customer;
import br.com.paulowalmeida.my_bank.model.account.CheckingAccount;
import br.com.paulowalmeida.my_bank.view.AccountView;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setFirstName("Samuel");
        customer1.setLastName("Winchester");
        customer1.setCpf("000.111.222-33");
        customer1.setRg("1234567");

        CheckingAccount checkingAccount1 = new CheckingAccount(customer1);
        checkingAccount1.setAgency("1234");
        checkingAccount1.setNumber("56789-0");
        checkingAccount1.deposit(1000);

        Customer customer2 = new Customer();
        customer2.setFirstName("Robert");
        customer2.setLastName("Singer");
        customer2.setCpf("999.888.777-66");
        customer2.setRg("7654321");

        CheckingAccount checkingAccount2 = new CheckingAccount(customer2);
        checkingAccount2.setAgency("1234");
        checkingAccount2.setNumber("56789-0");
        checkingAccount2.deposit(2000);

        /*-------------------*/
        AccountView.showInfoAccount(checkingAccount1);
        AccountView.showInfoAccount(checkingAccount2);

        if(checkingAccount1.transfer(checkingAccount2, 200)) {
            System.out.println("Transferencia realizada com sucesso!\n");
        } else {
            System.out.println("Não foi possível realizar a transferência :(\n");
        }

        AccountView.showInfoAccount(checkingAccount1);
        AccountView.showInfoAccount(checkingAccount2);
    }
}