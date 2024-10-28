package Java8Examples;

public class Role implements User {
	public static void main(String[] args) {

		Role role = new Role();
		role.userRole();

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] mergedArr = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
		System.out.println(java.util.Arrays.toString(mergedArr));
	}

	public static void test() {
		System.out.println("role created");
	}

	public void userRole() {
		createUser();
		test();
	}

	@Override
	public void createUser() {
		// TODO Auto-generated method stub

	}
}
