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

        CheckingAccount checkingAccount = new CheckingAccount(customer1);
        checkingAccount.setAgency("1234");
        checkingAccount.setNumber("56789-0");
        checkingAccount.deposit(1000);

        /*-------------------*/
        AccountView.showInfoAccount(checkingAccount);
    }
}