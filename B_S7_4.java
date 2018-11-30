import java.util.Scanner;
class B_S7_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		if((N+M)%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}