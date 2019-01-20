import java.util.*;
class P_S1_6
{
	static String areisomorphic(String str1,String str2)
	{

		int len_str1=str1.length();
		int len_str2=str2.length();
		int map[]=new int[256];
		Arrays.fill(map,-1);
		boolean marked[]=new boolean[256];
		Arrays.fill(marked,false);
		if(len_str1!=len_str2)
		{
			return "no";
		}
		else
		{
			for(int i=0;i<len_str1;i++)
			{
				if(map[str1.charAt(i)]==-1)
				{
					if(marked[str2.charAt(i)]==true)
						return "no";
					marked[str2.charAt(i)]=true;
					map[str1.charAt(i)]=str2.charAt(i);

				}
				else if(map[str1.charAt(i)]!=str2.charAt(i))
					return "no";
			}
			return "yes";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(areisomorphic(str1,str2));
	}
}