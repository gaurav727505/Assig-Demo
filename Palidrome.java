package PractiseJava;
import java.util.*;
public class Palidrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		int sum=0,r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Given no is palidrome");
		else
			System.out.println("Given no is not palidrome");
	}
}