import java.util.Scanner;
class B_S4_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fibo[]=new int[n+1];
		fibo[0]=0;
		fibo[1]=1;
		for(int i=2;i<=n;i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println(fibo[i]);
		}
		
	}
}