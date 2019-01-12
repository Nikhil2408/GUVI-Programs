import java.util.Scanner;
class B_S10_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int product=1;
		while(n!=0)
		{
			int remain=n%10;
			product=product*remain;
			n=n/10;
		}
		System.out.println(product);
	}
}