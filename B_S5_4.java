import java.util.Scanner;
class B_S5_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N>=1 && N<=10)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}