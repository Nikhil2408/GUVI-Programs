import java.util.Scanner;
class B_S6_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2!=0)
			System.out.println(n-1);
		else
			System.out.println(n);
	}
}