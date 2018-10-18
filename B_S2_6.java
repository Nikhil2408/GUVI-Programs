import java.util.*;
import java.lang.*;
class B_S2_6
{
	static void isPrime(int N,int Q)
	{
		int count=0;
		for(int i=N+1;i<Q;i++)
		{
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
			count=0;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		if(N<Q)
			isPrime(N,Q);
		else if(N>Q)
		{
			N=N^Q;
			Q=N^Q;
			N=N^Q;
			isPrime(N,Q);
		}
		else
			System.out.println("Please enter two different numbers");
	}
}