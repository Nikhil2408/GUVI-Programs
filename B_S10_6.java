import java.util.Scanner;
class B_S10_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int an=a1+(n-1)*d;
		int sum=((a1+an)*n)/2;
		System.out.println(sum);
	}
}