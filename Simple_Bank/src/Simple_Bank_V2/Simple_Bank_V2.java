
package Simple_Bank_V2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple_Bank_V2
  {
    public static void main(String[] args)
      {
        Bank2 B1 = new Bank2(null, 0);
     
        Scanner userInput = new Scanner(System.in);
        
        String acName;  
        System.out.print("Enter A/C Number: ");
        acName = userInput.nextLine();
        B1.setAccountNumber(acName);
        
        // Initial Balance
        boolean ex = true;
        while(ex)
        {
            Scanner bln = new Scanner(System.in);
            ex = false;
            double balance;
            try
            {
                System.out.print("Enter initial balance: ");
                balance = bln.nextInt();
                B1.setBalance(balance);
                System.out.println("");
                System.out.println("!!! Account Created Successfully !!!");
                System.out.println("--------------------------------");
                System.out.println("");
            }
            catch (InputMismatchException e)
            {
                System.out.println("");
                System.out.println("Entry should be a number");
                ex  = true;
            }
            finally
            {
                if(ex == true)
                {
                    ex = userChoice();
                }
                
                if(ex == false && B1.getBalance() == 0)
                {
                    System.out.println("Account Created with 0 (Zero) balance");
                    System.out.println("-------------------------------------");
                    System.out.println("");
                }
            }
        }
        
        System.out.println("A/C No: " + B1.getAccountNumber()+ " Balance: " + B1.getBalance());
        System.out.println("");
        System.out.println("");
        
        
        // Depositing
        ex = true;
        while(ex)
        {
            Scanner dep = new Scanner(System.in);
            ex = false;
            double deposit;
            
            try
            {
                System.out.print("Depositing: ");
                deposit = dep.nextInt();
                B1.setDeposit(deposit);
                System.out.println("Amount Deposited Successfully !!!");
                System.out.println("---------------------------------");
            }
            catch (InputMismatchException e)
            {
                System.out.println("");
                System.out.println("Entry should be a number !!!");
                ex  = true;
            }
            finally
            {
                if(ex == true)
                {
                    ex = userChoice();
                }
                
                if(ex == false)
                {

                }
            }
        }
        
        System.out.println("A/C No: " + B1.getAccountNumber()+ " Balance: " + B1.getBalance());
        System.out.println("");
        System.out.println("");
        
        // Withdrawing
        ex = true;
        while(ex)
        {
            Scanner wid = new Scanner(System.in);
            ex = false;
            double withdraw;
            
            try
            {
                
                ex = true;
                while(ex)
                {
                    ex = false;
                    try
                    {
                        System.out.print("Withdrawing: ");
                        withdraw = wid.nextInt();
                        B1.setWithdraw(withdraw);
                        System.out.println("");
                        System.out.println("!!!Amount withdrawn Successfully !!!");
                        System.out.println("---------------------------------");
                        
                        
                        
                    }
                    catch (NoWithdraw2 nD)
                    {
                        ex = true;   
                    }

                    finally
                    {
                        if(ex == true)
                            {
                                ex = userChoice();
                            }
                        else if (ex == false)
                        {
                            
//                            System.out.println("Ex value: " +ex);
//                            System.out.println("!!!!!Amount withdrawn Successfully !!!");
//                            System.out.println("---------------------------------");
                        }
                    }
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("");
                System.out.println("Entry should be a number !!!");
                ex  = true;
            }
            finally
            {
                if(ex == true)
                {
                    ex = userChoice();
                }
                
            }
        }
        
        System.out.println("A/C No: " + B1.getAccountNumber()+ " Balance: " + B1.getBalance());
        System.out.println("");
        System.out.println("");
      }

    
    
    public static boolean userChoice()
      {
            
            char choice;
            boolean ex = true;
            boolean loop = true;

            
            while(loop)
            {
                loop = false;
                Scanner ch = new Scanner(System.in);
                try
                {
             
                    System.out.println("Try again? (Y/N): ");

                    choice = ch.next(".").charAt(0);
                    
                    choice = Character.toUpperCase(choice);

                    System.out.println("Choice:"+ choice );

                    if (choice != 'Y' && choice != 'N')
                     {
                        System.out.println("Please type only Y or N");     
                        loop = true;
                     }
                    else if(choice == 'N')
                     {
                        ex = false;
                        loop = false;
                     }
                    else if(choice == 'Y')
                     {
                        loop = false;
                        ex = true;
                     }
                }
                catch (InputMismatchException e)
                {
                   System.out.println("");
                   System.out.println("Please type only Y or N");
                   loop = true;
                }
                finally
                {

                }
            
            }   
            return ex;       
               
               
     }
  }
    

