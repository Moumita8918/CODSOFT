package calculator;
import java.util.Scanner;

public class Grade_Cal 
{
	public static void Calculate(int b, int e, int p, int c, int m, int o)
	{
		//Calculate the Total marks
		System.out.println();
		int total=b+e+p+c+m+o;
		System.out.println("Student Total Marks : "+total);
		
		//calculate Average marks
		float avg=total/6;
		System.out.println("Avg is: "+avg);
		
		//Calculate Average-Percentage
		int percentage=(int) ((avg)/100*100);
		System.out.println("Student Avg Percentage is : "+percentage+"%");
		
		//Grade Calculation
		if(percentage >= 90)
		{
			System.out.println("Excellent!!");
			System.out.println("Your Grade: A");
		}
		else if(percentage < 90 && percentage >= 80)
		{
			System.out.println("Very Good!!");
			System.out.println("Your Grade: B");
		}
		else if(percentage < 80 && percentage >= 70)
		{
			System.out.println("Good!");
			System.out.println("Your Grade: C");
		}
		else if(percentage < 70 && percentage >= 60)
		{
			System.out.println("Satisfactory");
			System.out.println("Your Grade: D");
		}
		else if(percentage < 60 && percentage >= 50)
		{
			System.out.println("Work Hard");
			System.out.println("Your Grade: E");
		}
		else if(percentage < 50 && percentage >= 40)
		{
			System.out.println("Just Passed");
			System.out.println("Your Grade: F");
		}
		else 
		{
			System.out.println("Failed!");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.print("Enter Student Name: ");
		String Name=s.nextLine();
		
		System.out.print("Enter Student Roll Number: ");
		int roll=s.nextInt();
		
		System.out.print("Enter Student Reg. Number: ");
		int reg=s.nextInt();
		
		System.out.print("Enter Student Class: ");
		String cla=s.next();
		
		System.out.print("Enter Student Section: ");
		String sc=s.next();
		
		System.out.print("Enter the markes of Bengali: ");
		int Beng=s.nextInt();
		
		System.out.print("Enter the markes of English: ");
		int Eng=s.nextInt();
		
		System.out.print("Enter the markes of Physics: ");
		int Phy=s.nextInt();
		
		System.out.print("Enter the markes of Chemistry: ");
		int Chem=s.nextInt();
		
		System.out.print("Enter the markes of Math: ");
		int Math=s.nextInt();
		System.out.println();
		
		System.out.println("-:Choose Optional Subject:- ");
		System.out.println();
		System.out.print("1-> Biology");
		System.out.print("2-> Computer Application");
		System.out.print("Enter Your Choice: ");
		int ch=s.nextInt();
		int Op_Sub=0;
		
		//Take input of any one OPTIONAL SUBJECT
		switch(ch)
		{
			case 1: System.out.print("Enter the markes of Biology: ");
					Op_Sub=s.nextInt();
					break;
			
			case 2: System.out.print("Enter the markes of Computer Application: ");
					Op_Sub=s.nextInt();
					break;
		}
		
		//print the all details 
		System.out.println();
		System.out.println();
		System.out.println("Student Name : "+Name);
		System.out.println("Student Roll-Number : "+roll);
		System.out.println("Student Registration-Number : "+reg);
		System.out.println("Student Class : "+cla);
		System.out.println("Student Section : "+sc);
		
		//Call the function to calculate total,average and average percentage
		System.out.println();
		Calculate(Beng,Eng,Phy,Chem,Math,Op_Sub);
	}

}
