package in.winny.classes;

  class ClassObjects_21 {
	  String s;
	  
	    {
	        s = "FIRST";
	    }
	 
	    {
	        s = "SECOND";
	    }
	 
	    public ClassObjects_21()
	    {
	        s = "THIRD";
	    }
	 
	    public ClassObjects_21(String s)
	    {
	        this();
	 
	        System.out.println(this.s);
	    }
	
	 
 
	
	    public static void main(String[] args)
	    {
	    	ClassObjects_21 one = new ClassObjects_21("LAST");
	    }
	    }
