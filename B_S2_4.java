import java.util.*;
import java.lang.*;
class B_S2_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		for(int i=N+1;i<=Q;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}