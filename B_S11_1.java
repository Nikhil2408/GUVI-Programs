import java.util.Scanner;
class B_S11_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		for(int i=s.length()-n;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
	}
}