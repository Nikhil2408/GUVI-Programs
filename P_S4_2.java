import java.util.*;
class P_S4_2
{
	static String binarysearch(int arr[],int l,int r,int k)
	{
		int middle=0;
		int value=0;
		if(r>=l)
		{
			middle=l+(r-l)/2;
		
			if(k==arr[middle])
				value=arr[middle];
			else if(k>arr[middle])
				return binarysearch(arr,middle+1,r,k);
			else
				return binarysearch(arr,l,middle-1,k); 
		}
		if(k==value)
			return "yes";
		else
			return "no";
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(binarysearch(arr,0,N-1,k));
	}
}