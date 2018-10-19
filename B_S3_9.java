import java.util.Scanner;
class B_S3_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in minutes");
		int time_in_min=sc.nextInt();
		int time_in_hr=time_in_min/60;
		time_in_min=time_in_min%60;
		System.out.println(time_in_hr+"hr "+time_in_min+"min");
		
	}
}