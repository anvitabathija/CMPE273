package Final;

import java.util.Arrays;

import junit.framework.TestCase;

public class GenericsDemoTest extends TestCase {

	public void testFailure() throws Exception {
		
		GenericsDemo g = new GenericsDemo();
		Integer arr[] = {3,2,4};
		Integer arr_11[] = g.genericMethod(arr);
		
		Integer arr_12[] = {2,3,4};
		System.out.println(Arrays.toString(arr_11));
		assertEquals(Arrays.toString(arr_11),Arrays.toString(arr_12));
		
		Character arr2[] = {'r','a','p'};
		Character arr_21[] = g.genericMethod(arr2);
		
		Character arr_22[] = {'a','p','r'};
		
		assertEquals(Arrays.toString(arr_21),Arrays.toString(arr_22));
		
	}
	
}
