import java.util.Scanner;
class B_S7_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count_nonbin=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0' && s.charAt(i)!='1')
				count_nonbin++;
		}
		if(count_nonbin>0)
			System.out.println("no");
		else
			System.out.println("yes");

	}
}