package in.winny.classes;

public class ClassObjects_26 {
	
	    static
	    {
	        System.out.println(1);
	    }
	 
	    public static void main(String[] args)
	    {
	        System.out.println(2);
	    }
	}
	 
	  class ClassTwo
	{
	    {
	        System.out.println(3);
	    }
	 
	    public static void main(String[] args)
	    {
	    	ClassObjects_26.main(args);
	    }
}
