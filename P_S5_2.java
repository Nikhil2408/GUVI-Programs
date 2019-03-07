import java.util.*;
class P_S5_2
{
	static String check_sorted(int arr[])
	{
		if(arr.length==1)
			return "yes";
		else
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]<=arr[i+1])
					continue;
				else
					return "no";
			}
			return "yes";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(check_sorted(arr));
	}
}