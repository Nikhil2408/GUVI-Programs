import java.util.Scanner;
import java.math.*;
class B_S8_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int digit=n%10;
			n=n/10;
			if(digit%2!=0)
				System.out.print(digit+" ");
		}
	}
}