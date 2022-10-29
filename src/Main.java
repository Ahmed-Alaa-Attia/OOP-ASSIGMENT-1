import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Account test=new Account(1122,20000);
        test.setAnnualInterestRate(4.5);
        test.withdraw(2500);
        test.Deposit(3000);
        double balance = test.getBalance();
        double monthlyInterst = test.getMonthlyInterest();
        Date userDate = test.getDateCreated();
        System.out.println("your Balance is: "+balance);
        System.out.println("Monthly Rate is : "+monthlyInterst);
        System.out.println("Account Date : "+userDate);

    }
}