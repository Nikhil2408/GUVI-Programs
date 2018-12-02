import java.util.Scanner;
import java.math.*;
class B_S7_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=1)
		{
			n=(int)(n/2);
			count++;
		}
		System.out.println((int)Math.pow(2,count+1));
	}
}