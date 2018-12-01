import java.util.Scanner;
class B_S8_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		int R=sc.nextInt();
		if(N>L && N<R)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}