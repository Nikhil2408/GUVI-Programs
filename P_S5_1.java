import java.util.*;
class P_S5_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		while(n%k==0)
		{
			n/=k;
		}
		if(n==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}