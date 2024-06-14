package in.winny.string;

public class StringQuiz_8 {
	public static void main(String[] args) {
		String str1 = "Java";

		String str2 = "Java";

		System.out.println(str1 == str2);//checking Address

		System.out.println(str1.equals(str2));//checking content

		System.out.println(str1.hashCode() == str2.hashCode()); //checking hashCode
	}
}
