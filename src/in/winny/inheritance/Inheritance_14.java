package in.winny.inheritance;

public class Inheritance_14 {
	private int m = 48;
	}
	 
	class Y extends X
	{
	    void methodOfY()
	    {
	        System.out.println(m);//Because, private field ‘m’ is not visible to class Y.
	    }
}
