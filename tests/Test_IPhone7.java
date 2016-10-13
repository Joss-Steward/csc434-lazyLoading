import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * 
 * @author Joss Steward, Drew Rife, Brad Olah
 *
 * Tests the getters for the iphone7 class
 */
public class Test_IPhone7 {
	
	/**
	 * Mock class for IPhone7
	 */
	public class MockIPhone7 extends IPhone7 {
		/* Used for testing Lazy Loading */
		public int loads = 0;

		@Override
		public void Load(DomainObject obj) {
			loads++;
		}

		@Override
		public void Save(DomainObject obj) {
			// TODO Auto-generated method stub
		}
	}

	/**
	 * Tests the getters and lazy loading
	 * @throws Exception
	 */
	@Test
	public void testGetMethodsLazyLoading() throws Exception {
		MockIPhone7 testSubject = new MockIPhone7();

		/* gets the methods */
		ArrayList<Method> methods =
				LazyLoadVerifier.getAllGetMethods(MockIPhone7.class);

		for(Method m : methods){
			int old = testSubject.loads;
			m.invoke(testSubject);

			if(testSubject.loads == old + 1) {
				System.out.print("PASS: ");
			} else {
				System.out.print("FAIL: ");
			}

			System.out.println(testSubject.getClass().getSimpleName()
					+ "." + m.getName());

			assertEquals(old + 1, testSubject.loads);
		}
	}

}
