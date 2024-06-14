package in.winny.inheritance;

public class Inheritance_6 {
	 public Inheritance_6()
	    {
	        System.out.println("Class A Constructor");
	    }
	}
	 
	class B extends Inheritance_6
	{
	    public B()
	    {
	        System.out.println("Class B Constructor");
	    }
	}
	 
	class C extends B
	{
	    public C()
	    {
	        System.out.println("Class C Constructor");
	    }
	}
	 
	  class MainClass
	{
	    public static void main(String[] args)
	    {
	        C c = new C();
	    }
}
