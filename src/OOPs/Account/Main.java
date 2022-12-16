package OOPs.Account;

import OOPs.Account.Account;

public class Main {
    public static void main(String[] args) {
        Account ferdousAccount = new Account();

        ferdousAccount.setNumber("12345");
        ferdousAccount.setBalance(1000.00);
        ferdousAccount.setCustomerName("Ferdous Bhuiya");
        ferdousAccount.setCustomerEmail("ferdousb@bdsd.com");
        ferdousAccount.setCustomerPhone("954-123-4567");

        ferdousAccount.withdrawFunds(100);
        ferdousAccount.depositFunds(250);
        ferdousAccount.withdrawFunds(50);

        ferdousAccount.withdrawFunds(200);
        ferdousAccount.depositFunds(100);
        ferdousAccount.withdrawFunds(45.55);
        ferdousAccount.withdrawFunds(54.46);
        ferdousAccount.withdrawFunds(54.45);
    }
}
