package in.winny.string;

public class StringContainsVowels {
	public static void main(String[] args) {
		System.out.println(stringContainsVowels("hello")); // true
		System.out.println(stringContainsVowels("bbbb")); // false
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
