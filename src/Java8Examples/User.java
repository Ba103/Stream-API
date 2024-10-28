package Java8Examples;

@FunctionalInterface
public interface User {

	

	public void createUser();
	
	public  default void userRole() {
		// logic
		
		
	}
	
	public static void performOprations() {
		System.out.println(" hello");
	}
}
