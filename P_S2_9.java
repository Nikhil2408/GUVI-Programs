import java.util.Scanner;
class P_S2_9
{
	static void isprime(int n)
	{
		int count=0;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==0)
			System.out.print(n+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
				isprime(i);
		}
	}
}