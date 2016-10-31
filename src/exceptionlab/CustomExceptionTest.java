package exceptionlab;

import java.util.*;

public class CustomExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eenter your age ");
		int age = sc.nextInt();
		Validate(age);
   
		System.out.println("This is a example of custome exception ");
	}

	public static void Validate(int age) 
	{

		if(age<18)
		{
			try{	
				throw new InvalidAgeException("you are not eligeable");

			}
			catch(Exception inv)
			{

				inv.printStackTrace();	

			}
			finally{
				System.out.println("you are not eligibale to cast vote , you are "+(18-age)+ "less to become eligibale");
			}

		}
		else
		{
			System.out.println("you are eligeble to caste your vote");
          
           {System.out.println("You became eligibale to cast your vote " + (age-18) +" years back");}
		
		}



	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}

}