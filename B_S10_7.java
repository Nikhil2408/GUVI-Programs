import java.util.Scanner;
class B_S10_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int remain=n%10;
			System.out.print(remain);
			n=n/10;
		}
	}
}