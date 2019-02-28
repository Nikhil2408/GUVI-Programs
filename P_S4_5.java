import java.util.*;
class P_S4_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int map[]=new int[256];
		Arrays.fill(map,Integer.MAX_VALUE);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				continue;
			map[str.charAt(i)]++;
		}
		int min=map[0];
		for(int i=1;i<256;i++)
		{
			if(map[i]<min)
				min=map[i];
		}
		for(int i=0;i<map.length;i++)
		{
			if(map[i]==min)
				System.out.printf("%c"+" ",i);
		}
	}
}