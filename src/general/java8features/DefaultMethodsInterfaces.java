package general.java8features;

/**
 * Default methods in interfaces were introduced in Java 8 to provide backward
 * compatibility for existing code while adding new methods to interfaces. They
 * allow us to add new methods to existing interfaces without breaking the
 * existing code that implements those interfaces.
 * 
 * Default methods in interfaces can also be used to provide a default
 * implementation for a method. This can help reduce code duplication and make
 * interfaces easier to use by providing a default behavior for a method that
 * can be overridden when necessary.
 * 
 * Another benefit of default methods is that they allow interfaces to be used
 * as mixins, providing default behavior that can be composed with other
 * interfaces to create complex behavior.
 * 
 * Overall, default methods in interfaces provide a powerful tool for enhancing
 * the functionality of existing interfaces and making it easier to write clean,
 * reusable code in Java.
 * 
 * @author matias miguez
 *
 */
public class DefaultMethodsInterfaces {

	
	public interface MyInterface {
	    default void myDefaultMethod() {
	        System.out.println("Default Method");
	    }
	}

	
	public interface MyInterfaceWithArgument {
	    default void myDefaultMethod(String message) {
	        System.out.println("Default Method: " + message);
	    }
	}
	
	public interface MyInterfaceWithOneImplementation {
	    default void myDefaultMethod() {
	        System.out.println("Default Method");
	    }
	}

	public class MyClass implements MyInterfaceWithOneImplementation {
	    @Override
	    public void myDefaultMethod() {
	        System.out.println("Overridden Default Method");
	    }
	}


	
	public interface MyInterfaceWithCallingSuperImplementation {
	    default void myDefaultMethod() {
	        System.out.println("Default Method");
	    }
	}

	public class MyClassCallingSuper implements MyInterfaceWithCallingSuperImplementation {
	    @Override
	    public void myDefaultMethod() {
	    	MyInterfaceWithCallingSuperImplementation.super.myDefaultMethod();
	        System.out.println("Overridden Default Method");
	    }
	}

}
