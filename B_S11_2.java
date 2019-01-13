import java.util.Scanner;
class B_S11_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n%2==0)
		{
			n=n/2;
		}
		System.out.println(n);
	}
}