package OOPs.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ferdous", 1000, "alkja@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer= new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
    }

}
