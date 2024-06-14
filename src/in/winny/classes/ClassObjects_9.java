package in.winny.classes;

public class ClassObjects_9 {
	 int i;
	 
	    {
	        System.out.println("IIB-1");//Execute 2
	 
	        i = 100;  
	    }
	 
	    {
	        System.out.println("IIB-2");//Execute 3
	 
	        System.out.println(i); 
	 
	        i = 200;
	    }
	 
	    public static void main(String[] args)
	    {
	        System.out.println("main");//Execute 1
	 
	        ClassObjects_9 a = new ClassObjects_9();
	 
	        System.out.println(a.i);
	    }
}
