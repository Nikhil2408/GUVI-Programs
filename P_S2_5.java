import java.util.*;
class P_S2_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int map[]=new int[256];
		Arrays.fill(map,0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				continue;
			else
				map[str.charAt(i)]++;
		}
		int max=map[0];
		int index=0;
		for(int i=1;i<256;i++)
		{
			if(map[i]>max)
			{
				max=map[i];
				index=i;
			}
		}
		System.out.println((char)index);
	}
}