package Java8Examples;

import java.util.stream.Collectors;

public class NumberTransformer {

	public static void main(String[] args) {
		int input = 2345;

		int output = transformNumber(input);

		System.out.println("transformNumber :: " + output);
	}

	public static int transformNumber(int number) {
		String transformNumber = String.valueOf(number).chars().mapToObj(c -> (char) c)
				.map(c -> Character.getNumericValue(c)).map(digit -> (digit + 1) % 10).map(String::valueOf)
				.collect(Collectors.joining());

		return Integer.parseInt(transformNumber);
	}

}
