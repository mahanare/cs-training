package basics.prashanth.reflections;

import java.lang.reflect.Constructor;

import basics.pradeep.Calculator;

public class Reflection {
	public void reflect(Object object) {

		Class cls = object.getClass();

		System.out.println(cls.getCanonicalName());

		Method[] methods = cls.getMethods();

		for (Method method : methods) {

			System.out.println(method.getModifiers() + " " + method.getName()
					+ " has " + method.getParameterCount());
			if (method.getName().equalsIgnoreCase("addNumbers")
					&& method.getParameterCount() == 2) {

				try {

					Parameter[] params = method.getParameters();
					if (params.length == 2) {
						try {

							Parameter[] params = method.getParameters();
							if (params.length == 2) {

								if (params[0].getType().toString().equals("int")
										&& params[1].getType().toString().equals("int"))
									method.invoke(object, new Object[] { 23, 12 });
							}

						} catch (IllegalAccessException | IllegalArgumentException
								| InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				Constructor[] constructors = cls.getConstructors();
				for (Constructor constructor : constructors) {

					System.out.println(constructor.getModifiers() + " "
							+ constructor.getName() + " has "
							+ constructor.getParameterCount());
				}

					}
}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reflection reflection = new Reflection();
		reflection.reflect(new Calculator(20, 30));
	}
}