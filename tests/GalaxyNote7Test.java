import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

public class GalaxyNote7Test {
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

	@Test
	public void testGetMethodsLazyLoading() throws Exception {
		MockGalaxyNote7 testSubject = new MockGalaxyNote7();

		ArrayList<Method> methods =
				LazyLoadVerifier.getAllGetMethods(MockGalaxyNote7.class);

		for(Method m : methods){
			System.out.println(m.getName());

			int old = testSubject.loads;
			m.invoke(testSubject);

			assertEquals(old + 1, testSubject.loads);
		}
	}

}
