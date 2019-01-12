import java.util.Scanner;
import java.math.*;
class B_S10_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int time=sc.nextInt();
		int rate=sc.nextInt();
		int si=(principal*rate*time)/100;
		System.out.println(si);
	}
}