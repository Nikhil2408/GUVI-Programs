import java.util.Scanner;
import java.math.*;
class B_S8_6
{
	static String isComposite(int n)
	{
		if(n>1)
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return "yes";
			}
			return "no";
		}
		else
			return "no";
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isComposite(n));
		
	}
}