import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated=new Date();

    public Account()
    {

    }

    public Account(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    int getId()
    {
        return this.id;
    }

    double getBalance()
    {
        return this.balance;
    }
    double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    void setId(int idset)
    {
        this.id=idset;
    }

    void setBalance( double balanceSet)
    {
        this.balance=balanceSet;
    }

    void setAnnualInterestRate(double annualSet)
    {
        this.annualInterestRate=annualSet;
    }

    Date getDateCreated()
    {
        return dateCreated;
    }

    public double getMonthlyRate()
    {
        return this.annualInterestRate/12;
    }

   public double getMonthlyInterest()
   {
       return this.balance*(getMonthlyRate()/100);
   }

   public void withdraw(double amount)
   {
       balance-=amount;
   }

   public void Deposit(double credit)
   {
       balance+=credit;
   }
}
