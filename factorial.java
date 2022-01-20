package assignment2;
import java.util.Scanner;
//WAP to find the factorial of a number?
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,fact=1;
System.out.print("Enter Number:=");
int num=sc.nextInt();
for(i=1;i<=num;i++)
{
	fact=fact*i;
}
System.out.println("Factorial is:="+fact);

	}

}
