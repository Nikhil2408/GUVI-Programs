import java.util.Scanner;
class B_S6_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int remain=n%10;
			n=n/10;
			sum=sum+remain;
		}
		System.out.println(sum);
	}
}