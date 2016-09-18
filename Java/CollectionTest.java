package Final;

import junit.framework.TestCase;

public class CollectionTest extends TestCase {
	public void testFailure() throws Exception {
		
		UniqueDuplicateCountChar ud = new UniqueDuplicateCountChar();
		ud.checkUniqueDup("anvita");
		
		UniqueDuplicateCountChar ud1 = new UniqueDuplicateCountChar();
		ud.checkUniqueDup("");
	}
}
