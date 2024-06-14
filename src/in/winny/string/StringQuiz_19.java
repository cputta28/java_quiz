package in.winny.string;

public class StringQuiz_19 {
	public static void main(String[] args) {
		String s1 = new String("JAVA");

		String s2 = new String("JAVA");

		System.out.println(s1 == s2);// checking address

		System.out.println(s1.equals(s2));//checking content

		System.out.println(s1 == s2.intern());//s2 getting object from scp

		System.out.println(s1.intern() == s2.intern());//s1,s2 getting object from scp

		System.out.println(s1.intern() == s2);//s1 getting object from scp
	}
}
