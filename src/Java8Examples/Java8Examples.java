package Java8Examples;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Examples {

	public static void main(String[] args) {
		String str = " my name is balaji";

		String[] word = str.split("");
		Map<String, Long> collect = Arrays.stream(word)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);
		
		Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
							.stream().filter(entry -> entry.getValue()>1)
							.forEach(entry -> System.out.println("character: " + entry.getKey()+ " ,count :: " + entry.getValue()));

		int input = 2346;

		String collect2 = String.valueOf(input).chars().mapToObj(e -> (char) e).map(c -> Character.getNumericValue(c))
				.map(digit -> (digit + 1) % 10).map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect2);

		String name = "Balaji";
		String[] names = name.split(" ");
		String reverseName = Arrays.stream(names).map((w) -> new StringBuffer(w).reverse().toString())
				.collect(Collectors.joining());
		System.out.println(reverseName);

		String collect3 = name.chars().mapToObj(e -> String.valueOf((char) e)).distinct().collect(Collectors.joining());
		System.out.println(collect3);

	}

}
