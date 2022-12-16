package OOPs.Account;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;

    public void depositFunds(double depositAmount)
    {
        balance += depositAmount;
        System.out.println("Deposit of $"+
                depositAmount+ " made. New balance is $"+this.balance);
    }

    public void withdrawFunds(double withdrawlAmount)
    {
        if(balance-withdrawlAmount <0)
        {
            System.out.println("Insufficient Funds! you only have $"
            +balance+" in your account.");
        }else
        {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal of $"+ withdrawlAmount
            + " processed, Remaining balance = $"+balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private String customerPhone;

}
