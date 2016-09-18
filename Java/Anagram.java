package Final;
import java.util.*;

class Anagram
{
	public static void main(String args[])
	{
		String s1 = "iceman";
		String s2 = "cinema";

		Anagram ac = new Anagram();
		boolean result = ac.check(s1,s2);
		
		if(result)
			System.out.println(s1+" and "+s2+" are anagrams");
		else
			System.out.println(s1+" and "+s2+" not anagrams");
		
	}

	boolean check(String s1, String s2)
	{
		boolean anagram = true;

		if(s1.length() != s2.length())
			return false;
		else
		{
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);


			for(int i = 0; i < arr1.length; i++)
			{
				if(!(arr1[i] == arr2[i]))
					anagram = false;
			}
			
			if(anagram)
				return true;
			else
				return false;
			
			
		}

	}
}