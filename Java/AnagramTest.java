package Final;

import junit.framework.TestCase;

public class AnagramTest extends TestCase {
	public void testFailure() throws Exception {
		Anagram test = new Anagram();
		String s1 = "anvita";
		String s2 = "bathija";
		
		boolean testnegative = test.check(s1,s2);
		
		assertEquals(false,testnegative);
		
		String s3 = "iceman";
		String s4 = "cinema";
		
		boolean testpositive = test.check(s3, s4);
		assertEquals(true,testpositive);
	}
	
	
}
