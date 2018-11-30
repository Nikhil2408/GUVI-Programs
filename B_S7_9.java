import java.util.Scanner;
import java.math.*;
class B_S7_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		if(Math.abs(N-M)%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}