import java.util.Scanner;
class B_S11_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder result=new StringBuilder();
		String words[]=str.split("\\s");
		for(int i=0;i<words.length;i++)
		{
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		System.out.println(result);
	}
}