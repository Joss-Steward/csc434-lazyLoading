import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.junit.Test;

/**
 * 
 * @author Joss Steward, Drew Rife, Brad Olah
 * 
 * Tests for a GalazyNote7
 *
 */
public class Test_GalaxyNote7 {
	public class MockGalaxyNote7 extends GalaxyNote7 {
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
	 * Tests the getters
	 * @throws Exception
	 */
	@Test
	public void testGetMethodsLazyLoading() throws Exception {
		MockGalaxyNote7 testSubject = new MockGalaxyNote7();

		ArrayList<Method> methods =
				LazyLoadVerifier.getAllGetMethods(MockGalaxyNote7.class); 

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
