import java.util.Scanner;
import java.lang.Math;
class B_S2_8
{
	static void armstrong(int start,int end)
	{
		for(int i=start+1;i<end;i++)
		{
		  int temp=i;
		  int sum=0;
		     while(temp!=0)
				{
					int remain=temp%10;
					temp=temp/10;
					sum=sum+(int)Math.pow(remain,3);
				}
		  if(sum==i)
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		if(start<end)
		{
			armstrong(start,end);
		}
		else if(start>end)
		{
			start=start^end;
			end=start^end;
			start=start^end;
			armstrong(start,end);
		}
		else
			System.out.println("Please enter two different numbers");
		
	}
}