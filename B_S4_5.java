import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class B_S4_5
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));		
		String str=bf.readLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				count++;
		}
		
		System.out.println(count);
	}
}