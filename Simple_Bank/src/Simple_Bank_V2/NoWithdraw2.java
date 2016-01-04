
package Simple_Bank_V2;


public class NoWithdraw2 extends Exception
  {
    public NoWithdraw2 ()
      {
          System.out.println("Balance reaches less than the minimum required balance. Withdrawl not possible");
      }
    
  }
