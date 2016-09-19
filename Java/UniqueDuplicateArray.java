package Final;
import java.util.*;
import java.io.*;

class UniqueDuplicateArray
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a new string");
			String ip = br.readLine();
			
			UniqueDuplicateArray ud = new UniqueDuplicateArray();
			ud.checkUniqueDup(ip);

		}
		catch(Exception e)
		{
			System.out.println("Exception caught : "+e.toString());
		}
	}
	
	void checkUniqueDup(String ip)
	{
		int n = ip.length();
		
		String arr[] = new String[n];
		
		if(n > 0)
		{
			for(int i = 0;i<n;i++)
			{
				char c = ip.charAt(i);
				arr[i] = Character.toString(c);
			}
				
			ArrayList<String> alpha = new ArrayList<String>();
			ArrayList<String> duplicate = new ArrayList<String>();
	
			for(String current: arr)
			{
				if(alpha.contains(current))
					duplicate.add(current);
				else
					alpha.add(current);
			}
			
			System.out.println("Unique characters in String "+ip+" are : ");
			System.out.println(alpha);
	
			System.out.println("Duplicate characters in String "+ip+" are : ");
			System.out.println(duplicate);
		}
		else
			System.out.println("Empty String");
	}
}
