import java.util.Scanner;

public class AccountInheritance {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        System.out.println("Checking Account Menu");
        System.out.println("Input Account Name:");
        String name = in.nextLine();
        System.out.println("Input Account Number: ");
        String number = in.nextLine();
        System.out.println("Input Account Balance: ");
        double balance = in.nextDouble();
        System.out.println("Input Account Fees: ");
        double fees = in.nextDouble();
        CheckingAccount c = new CheckingAccount(name, number, balance, fees);
        System.out.println("Name = " + c.getAccName());
        System.out.println("Number = " + c.getAccNum());
        System.out.println("Balance = " + c.getBal());
    }
}