import java.util.Scanner;
//import java.math.*;
class P_S1_3
{
	static int revese_no(int n)
	{
		int reverse=0;
		while(n!=0)
		{
			int remain=n%10;
			n=n/10;
			reverse=reverse*10+remain;
		}
		return reverse;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(revese_no(n));
	}
}