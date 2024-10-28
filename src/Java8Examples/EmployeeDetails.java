package Java8Examples;

public class EmployeeDetails {

	private Integer Id;
	private String name;
	private double salary;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		EmployeeDetails emp1 = new EmployeeDetails();

		emp1.setId(1);
		emp1.setName("Balaji");
		emp1.setSalary(15000.00);

		emp.setId(2);
		emp.setName("yesh");
		emp.setSalary(25000.00);

		System.out.println(emp1.getId());
	}

}
