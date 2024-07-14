package Task3;

public class Main {

    public static void main(String args[]) {

        BankAccount userAccount = new BankAccount(1000);

        ATM atmMachine = new ATM(userAccount);

        atmMachine.startATM();

    }

}