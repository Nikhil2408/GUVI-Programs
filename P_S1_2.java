import java.util.Scanner;
//import java.math.*;
class P_S1_2
{
	static long factorial(int n)
	{
		long product=1;
		if(n==0)
			return 1;
		else
		{
			while(n!=0)
			{
				product=product*n;
				n--;
			}
		}
		return product;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
}