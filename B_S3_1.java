import java.util.Scanner;
import java.lang.Math;
class B_S3_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int sum=(n)*((2*a)+(n-1)*d)/2;
		System.out.println(sum);
		
	}
}