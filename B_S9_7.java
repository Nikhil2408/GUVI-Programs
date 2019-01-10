import java.util.Scanner;
class B_S9_7
{
	static int gcd(int a,int b)
	{
		if(a==b)
			return a;
		if(a%b==0)
			return b;
		if(b%a==0)
			return a;
		if(a>b)
			return gcd(a%b,b);
		else
			return gcd(a,b%a);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
}