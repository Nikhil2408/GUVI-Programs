import java.util.*;
import java.lang.*;
class B_S2_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				count++;

		}
		if(count>0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}