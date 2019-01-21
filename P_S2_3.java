import java.util.Scanner;
import java.math.*;
class P_S2_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0;
		while(n>0)
		{
			int remain=n%10;
			n=n/10;
			result=result+(int)Math.pow(remain,2);
		}
		System.out.println(result);
	}
}