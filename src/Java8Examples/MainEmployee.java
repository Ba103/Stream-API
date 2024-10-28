package Java8Examples;

import java.util.List;
import java.util.stream.Collectors;

public class MainEmployee {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeDataBase.getAllEmployees();

//		employees.forEach(System.out::println);
//		employees.stream().forEach(e -> System.out.println(e.getDept() + " , " + e.getSalary()));

		List<Employee> deptEmployees = employees.stream()
				.filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000).collect(Collectors.toList());
		System.out.println(deptEmployees);
		
		
//      forEach(Consumer)
//      filter(Predicate)
//      collect(Collector)
//      map(Function)
//      distinct()
//      flatMap(Function)
//      sorted(Comparator both ASC and DESC)
//      min() & max()
//      GroupBy
//      findFirst()
//      findAny()
//      anyMatch(Predicate)
//      allMatch(Predicate)
//      noneMatch(Predicate)
//      limit(long maxSize)
//      skip(long n)
	}

}
