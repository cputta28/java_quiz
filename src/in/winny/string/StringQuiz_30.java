package in.winny.string;

public class StringQuiz_30 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("0123456789");

		System.out.println(sb.delete(3, 6).deleteCharAt(4).deleteCharAt(5));
	}
}
