package in.winny.inheritance;

public class Inheritance_18 {
	  int[] a = new int[5];
	  
	    {
	        a[0] = 10;
	    }
	}
	 
  class MainClass extends Inheritance_18
	{
	    {
	        a = new int[5];
	    }
	 
	    {
	        System.out.println(a[0]);
	    }
	 
	    public static void main(String[] args)
	    {
	        MainClass main = new MainClass();
	    }
}
