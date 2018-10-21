import java.util.Scanner;
class B_S4_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().trim();
		int word=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				word++;
		}
		System.out.println(word);
	}
}