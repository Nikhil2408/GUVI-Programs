import java.util.*;
import java.math.*;
class P_S3_3
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr1[]=new int[n+k];
		int arr2[]=new int[k];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr1[n-k]=arr2[i];
			int max=arr1[0];
			for(int j=1;j<arr1.length;j++)
			{
				if(arr1[j]>max)
					max=arr1[j];
			}
			System.out.print(max+" ");
			k--;
		}

	}
}