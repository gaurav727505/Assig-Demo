package assignment1;

public class forloop {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("sum="+sum);

	}

}
