package in.winny.string;

public class StringQuiz_10 {
	public static void main(String[] args) {
		String str1 = new String("Java");

		String str2 = new String("Java");

		System.out.println(str1 == str2);

		System.out.println(str1.equals(str2));

		System.out.println(str1.hashCode() == str2.hashCode());
	}
}
