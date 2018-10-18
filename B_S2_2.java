import java.util.*;
import java.lang.*;
class B_S2_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		int temp=num;
		while(temp!=0)
		{
			int remain=temp%10;
			temp=temp/10;
			reverse=reverse*10+remain;
		}
		if(num==reverse)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}