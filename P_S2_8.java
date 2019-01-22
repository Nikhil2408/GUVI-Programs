import java.util.*;
class P_S2_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="kabali";
		String arr[]=new String[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		int map1[]=new int[256];
		Arrays.fill(map1,0);
		for(int i=0;i<str.length();i++)
		{
			map1[str.charAt(i)]++;
		}
		int map2[]=new int[256];
		Arrays.fill(map2,0);


		for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				map2[arr[i].charAt(j)]++;
			}
			if(Arrays.equals(map1,map2))
				count++;
			Arrays.fill(map2,0);
		}
		System.out.println(count);

	}
}