package in.winny.string;

public class StringQuiz_32 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("11111");

		System.out.println(sb.insert(3, false).insert(5, 3.3).insert(7, "One"));
	}
}
