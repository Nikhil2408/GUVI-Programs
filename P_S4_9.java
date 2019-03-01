import java.util.*;
class P_S4_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		if(n==1)
		{
			count=1;
		}
		while(n>1)
		{

			if(n%2!=0)
			{
				count=0;
				break;
			}
			else
			{
				count=1;
			}
			n=n/2;
		}
		if(count==0)
			System.out.println("no");
		else
			System.out.println("yes");
	}
}