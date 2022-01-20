package assignment2;
import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		//WAP to check whether a person is eligible for voting
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age");
		int  age=sc.nextInt();
		if(age>=18)
		
			System.out.println("Person is elegiable for voting");
		
		else
		
			System.out.println("Person is not elegiable for voting");
		

	}

}
