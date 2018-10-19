import java.util.Scanner;
import java.util.Arrays;
class B_S3_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(n%2==0)
		{
			int median=(arr[n/2]+arr[(n/2)-1])/2;
			System.out.println(median);
		}
		else
		{
			int median=arr[n/2];
			System.out.println(median);
		}
	}
}