package in.winny.string;

public class StringQuiz_29 {
	public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("01234");
         
        sb.append(1.1).append('A').append(22).append(false).append("null");
         
        System.out.println(sb);
    }
}
