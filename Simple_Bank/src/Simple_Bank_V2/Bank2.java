
package Simple_Bank_V2;

import jdk.nashorn.internal.objects.NativeString;

public class Bank2
  {
    private String accountNumber;
    
    private double balance;
    
    public Bank2(String accountNumber, double balance)
      {
        this.accountNumber = accountNumber;
        this.balance = balance;
      }

    public String getAccountNumber()
      {
        return NativeString.toUpperCase(accountNumber);
      }

    public void setAccountNumber(String accountNumber)
      {
        this.accountNumber = accountNumber;
      }

    public double getBalance()
      {
        return balance;
      }

    public void setBalance(double balance)
      {
        this.balance = balance;
      }

    public void setDeposit(double deposit)
      {
        balance = balance + deposit;
      }
  
    public void setWithdraw(double withdraw) throws NoWithdraw2
      {
        if(balance - withdraw < 0)
            throw new NoWithdraw2();
        else
            balance = balance - withdraw;
      }
  }
