package assignment2;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// WAP to check whether a given year is a LEAP year
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year =sc.nextInt();
		
		if((year%4==0))
			System.out.println("The is Leap year");
		else 
			System.out.println("The is not Leap year");
			
			
	}

}
