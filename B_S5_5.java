import java.util.Scanner;
class B_S5_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		while(N!=0)
		{
			N=N/10;
			count++;
		}
		System.out.println(count);
	}
		
}