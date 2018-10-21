import java.util.Scanner;
class B_S5_7
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
		int max=arr[0];
		int low=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];	
			if(arr[i]<low)
				low=arr[i];		
		}
		System.out.println(low+" "+max);
		
	}
}