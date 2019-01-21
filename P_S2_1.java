import java.util.Scanner;
class P_S2_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		if(s.equals("saturday") || s.equals("sunday"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}