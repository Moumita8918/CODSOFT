package atm;
import java.util.*;

class Bank_Details
{
	private double Bank_Bal;
	
	public Bank_Details(double Initial_Bal)
	{
		this.Bank_Bal=Initial_Bal;
	}
	
	public double Get_Bal()
	{
		return Bank_Bal;
	}
	
	public void Deposite_Amt(double Amount)
	{
		if(Amount>0)
		{
			Bank_Bal=Bank_Bal+Amount;
			System.out.println();
			System.out.println("   Rs. "+Amount+" is Successfully deposited...");
			System.out.println("   Your Bank Balance is : Rs. "+Bank_Bal);
		}
		else
		{
			System.out.println("   Please enter a valid account");
		}
	}
	
	public void Withdraw_Amt(double Amount)
	{
		if(Amount>0 && Amount<Bank_Bal)
		{
			Bank_Bal=Bank_Bal-Amount;
			System.out.println();
			System.out.println("   Transection Successfully!!");
			System.out.println("   Your Bank Balance is : Rs. "+Bank_Bal);
		}
		else if(Amount<0)
		{
			System.out.println();
			System.out.println("   Please enter a valid account");
		}
		else
		{
			System.out.println();
			System.out.println("   You have not Suffiient amount");
			System.out.println("   Please enter valid amount");
			System.out.println("   your A/C Balance is: Rs. "+Bank_Bal);
		}
}




public class ATM_Machine 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
        System.out.println("  --------------------------------------------------");
        System.out.println("  |                   ATM MACHINE                  |");
        System.out.println("  --------------------------------------------------");
        System.out.println("");
		double Initial_Bal=20000;
		Bank_Details Bd=new Bank_Details(Initial_Bal);
		double Amount;
		do
		{
			System.out.println();
			System.out.println("			WELCOME");
			System.out.println("");
			System.out.println("	 -:Please Choose Following Options:-");
			System.out.println("");
			System.out.println("   1->Check Balance ");
			System.out.println("   2->Diposite");
			System.out.println("   3->Withdraw");
			System.out.println("   4->Exit");
			System.out.print("   Please Enter Choice Which You Want to Do :");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("   Your Current balance is-> "+Bd.Get_Bal());
					break;
					
				case 2:	System.out.print("   Please Enter Amount That You Want to Deposite: ");
						Amount=sc.nextDouble();
						Bd.Deposite_Amt(Amount);
						break;
					   
				case 3:	System.out.print("   Please Enter Amount That You Want to Withdraw: ");
						Amount=sc.nextDouble();
						Bd.Withdraw_Amt(Amount);
						break;
					   
				case 4:	
						System.out.println();
						System.out.println("  --------------------------------------------------");
						System.out.println("  |                   THANK YOU!                   |");
						System.out.println("  --------------------------------------------------");
						System.exit(0);
						break;
				       
				case 5:System.out.println("   Invalid Choice!");
					   
			}
			
		}while(true);
	}
  }
}

