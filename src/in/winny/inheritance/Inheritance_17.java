package in.winny.inheritance;

public class Inheritance_17 {
	 static int i = 111;
	 
	    int j = 222;
	 
	    {
	        i = i++ - ++j;
	    }
	}
	 
	class ClassTwo extends Inheritance_17
	{
	    {
	        j = i-- + --j;
	    }
}
