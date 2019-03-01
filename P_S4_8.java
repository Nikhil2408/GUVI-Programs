import java.util.*;
class P_S4_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				if(i%2==0)
				{
					System.out.print(i+" ");
				}
				if((n/i)%2==0)
					System.out.print(n/i+" ");
			}
		}
	}
}