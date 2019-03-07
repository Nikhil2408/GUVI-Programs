import java.util.*;
class P_S4_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int quo=(int)Math.floor(n/2);
		int num2=quo;
		int num1=1;
		int count=1;
		while(num2>0)
		{
			num2--;
			count++;
		}
		System.out.println(count);
	}
}