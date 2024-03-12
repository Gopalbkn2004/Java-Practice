import java.util.*;
class Exceptionhanding
{
	public static void main(String[] are)
	{
		Scanner s1=new Scanner(System.in);
		int a=50,b=0;
		try{		
			c=a/b;
		}
		catch(ArithmeticException e)
		{
		int n=s1.nextInt();
	System.out.println(n+"Zero can't be divided");
		}
		s1.close();
	}
}

		