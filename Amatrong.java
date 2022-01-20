package assignment2;

import java.util.Scanner;

public class Amatrong {

	public static void main(String[] args) 
	{
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the no");
	          int n=sc.nextInt();
	          int r;
	          int c;
	          int sum=0;
	          int temp;
	          temp=n;
	          while(n>0)
	          {
	        	  r=n%10;
	        	  c=r*r*r;
	        	  sum=sum+c;
	        	  n=n/10;
	          }
	          n=temp;
	          if(n==sum)
	        	  System.out.println("Given no is Amastrong no");
	          else
	        	  System.out.println("Given no is not Amsastrong no");

		}

	}


	}

}
