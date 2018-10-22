import java.util.Scanner;
class B_S6_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		N=N*M;
		if(N%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}