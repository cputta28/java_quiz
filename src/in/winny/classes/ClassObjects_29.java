package in.winny.classes;

public class ClassObjects_29 {
	 static int i = 10, j = 20;
	 
	    int m = 30, n = 40;
	 
	    public static void main(String[] args)
	    {
	    	ClassObjects_29 a1 = new ClassObjects_29();
	 
	    	ClassObjects_29 a2 = new ClassObjects_29();
	 
	        a1.i = 100;
	 
	        System.out.println(a2.i);
	 
	        a2.j = 200;
	 
	        System.out.println(a1.j);
	 
	        a1.m = 300;
	 
	        System.out.println(a2.m);
	 
	        a2.n = 400;
	 
	        System.out.println(a1.n);
	    }
}
