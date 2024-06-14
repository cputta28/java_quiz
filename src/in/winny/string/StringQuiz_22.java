package in.winny.string;

public class StringQuiz_22 {
	public static void main(String[] args) {
		String[] strings = { "Java", "Python", "JavaScript", "HTML", "CSS" };

		String languages = String.join("_", strings);

		System.out.println(languages);
	}
}
