import java.util.*;
import java.lang.*;
class B_S2_4
{
	static void isodd(int N,int Q)
	{
		for(int i=N+1;i<Q;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		if(N<Q)
			isodd(N,Q);
		else if(N>Q)
			{
				N=N^Q;
				Q=N^Q;
				N=N^Q;
				isodd(N,Q);
			}
			else
				System.out.println("Please enter two different numbers");

	}
}