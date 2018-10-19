import java.util.Scanner;
import java.lang.Math;
class B_S2_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int remain=temp%10;
			temp=temp/10;
			sum=sum+(int)Math.pow(remain,3);
		}
		if(sum==num)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}