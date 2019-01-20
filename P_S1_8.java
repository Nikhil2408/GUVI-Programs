import java.util.Scanner;
//import java.math.*;
class P_S1_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		String words[]=str.split("\\s");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<words.length;i++)
		{
			sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		System.out.println(sb);
	}
}