package assignment1;

public class ThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int o=Integer.parseInt(args[2]);
		sum = sum+(m+n+o);
		System.out.println("sum="+sum);	
	}
}
