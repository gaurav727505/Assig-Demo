package assignment1;

public class salary {

	public static void main(String[] args) {
		int bs=Integer.parseInt(args[0]);
		int da= (bs/100)*20;
		int hra=(bs/100)*30;
		int gross=bs+da+hra;
		System.out.println("basic salary="+bs);
		System.out.println("DA="+da);
		System.out.println("HRA="+hra);
		System.out.println("GROSS="+gross);
		
		if(bs>0 && bs<4000)
		{
			int income=(gross/100)*4;
			System.out.println("Income Tax="+income);

		}
		if(bs>=4000  && bs<10000)
		{
			int income=(gross/100)*6;
			System.out.println("Income Tax="+income);
		}
		if(bs>=10000  && bs<17000)
		{
			int income=(gross/100)*8;
			System.out.println("Income Tax="+income);
		}
		if(bs>=17000  && bs<27000)
		{
			int income=(gross/100)*10;
			System.out.println("Income Tax="+income);
		}
		if( bs>=27000)
		{
			int income=(gross/100)*15;
			System.out.println("Income Tax="+income);
		}
			 


	}

}
