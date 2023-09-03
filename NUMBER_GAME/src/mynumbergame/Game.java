package mynumbergame;
import java.util.*;
public class Game 
{
	public static void main(String[] args) 
	{
		Random Ran_number= new Random();
		//To Generate the random number between 1 to 100
	    int right_Guess=Ran_number.nextInt(100);
	    //To calculate how many attempt user use
	    int attempt=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("");
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" |                 WELCOME TO NUMBER GAME                     |");
        System.out.println(" --------------------------------------------------------------");
        System.out.println("");
	    System.out.println("  Guess a number between 1 to 100, You will have only 10 turns!" );
	    System.out.println("  best of luck!");
	    
	    int Userguess_number;
	    int i=0;
	    boolean win=false;
	    while(win==false) 
	    {
	      System.out.print("  Player guess: ");
	      //Input the user guess
	      Userguess_number=s.nextInt();
	      attempt++;
	    
		if(Userguess_number==right_Guess)//User guess equal the random number
		{
	      win=true;
	    }
	    else if(i>8)//Set limit "8" out of "10" attempt
	    {
	    	System.out.println("");
		    System.out.println(" -------------------------------------------------------------");
		    System.out.println(" |          SORRY!! You loose! The right answer was: "+right_Guess+"      |");
		    System.out.println(" |          	          Please Try Again....               |");
		    System.out.println(" -------------------------------------------------------------");

	      return;
	    }
	    else if(Userguess_number<right_Guess)//User guess less than the random number
	    {
	      i++;
	      System.out.println("  Your Guess is too low! Turns left: "+(10-i));
	    }
	    else if(Userguess_number>right_Guess)//User guess higher than the random number
	    {
	      i++;
	      System.out.println("  Your Guess is too high! Turns left: "+(10-i));
	    }
	 }
	    System.out.println("");
	    System.out.println("--------------------------------------------------------------");
	    System.out.println("|              Congratulations!!....You win!....             |");
	    System.out.println("|              Guess number was "+right_Guess+"                           |");
	    System.out.println("|        You used "+attempt+" turns to guess the right number          |");
	    System.out.println("|           Your score is: "+((11-attempt)*10)+" out of 100                     |");
	    System.out.println("--------------------------------------------------------------");
	}
}
