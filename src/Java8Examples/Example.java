package Java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 4, 5, 3, 6, 50);
		List<Integer> list2 = Arrays.asList(5, 7, 9, 8, 1, 2);
		List<Integer> list = list1.stream().filter(list2::contains).collect(Collectors.toList());

		System.out.println(list);

		List<String> result = Arrays.asList("spring", "spring Boot", "Hibernate", "spring cloud");
		String subString = "spring";
		List<String> output = result.stream().filter(str -> str.contains(subString)).collect(Collectors.toList());

		System.out.println(output);
	}

}
