import java.lang.reflect.Method;
import java.util.ArrayList;

public class LazyLoadVerifier {

	/**
	 * Saves all the method names into an ArrayList and returns it
	 *
	 * @param c - class being passed in
	 * @return methodNames - ArrayList of all the method names
	 * @throws Exception
	 */
	public static ArrayList<Method> getAllGetMethods(Class classToTest) throws Exception {
		Method[] methods = classToTest.getDeclaredMethods();

		ArrayList<Method> getMethods = new ArrayList<Method>();

		for(Method m : methods) {
			String methodName = m.getName();

			if(methodName.startsWith("get")) {
				getMethods.add(m);
			}
		}

		return getMethods;
	}
}
