import java.util.Scanner;
import java.math.*;
class P_S1_9
{
	static int isPrime(int l, int r)
	{
		int count=0;
		int countprime=0;
		for(int i=l;i<=r;i++)
		{
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				countprime++;
			count=0;
		}
		return countprime;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(l<r)
			System.out.println(isPrime(l,r));
		else
		{
			l=l^r;
			r=l^r;
			l=l^r;
			System.out.println(isPrime(l,r));
		}
	}
}