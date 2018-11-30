import java.util.Scanner;
class B_S7_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int K=sc.nextInt();
		for(int i=0;i<K;i++)
		{
			System.out.print(s.charAt(i));
		}
	}
}