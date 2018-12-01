import java.util.Scanner;
import java.math.*;
class B_S8_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int product=n*m;
		int temp=(int)Math.sqrt(product);
		if(Math.pow(temp,2)==product)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}