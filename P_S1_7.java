import java.util.Scanner;
public class P_S1_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str1.length();i++)
		{
		    if(i%2==0)
		    {
		    	if(i+1<str1.length())
		    		sb.append(str1.charAt(i+1));
		    	else
		    		sb.append(str1.charAt(i));
		    }
		    else
		    	sb.append(str1.charAt(i-1));
		}
		System.out.println(sb);
	}
}