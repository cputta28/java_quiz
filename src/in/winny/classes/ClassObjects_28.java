package in.winny.classes;

public class ClassObjects_28 {
	  static int methodOne(int i)
	    {
	        i = i++ + --i;
	 
	        return i;
	    }
	 
	    static int methodTwo(int i)
	    {
	        i = i-- - ++i + methodOne(i);
	 
	        return i;
	    }
	 
	    public static void main(String[] args)
	    {
	        int i = 11;
	 
	        System.out.println(methodTwo(i) + ++i - --i);
	    }
}
