package in.winny.access.modifiers;

 public class AccessModifier_5 {

	    public void methodOfA()
	    {
	        System.out.println("Class A");
	    }
	}
	 
	class D extends AccessModifier_5
	{
	    @Override
		 
	  public  void methodOfA()
	    {
	        System.out.println("Class B");
	    }
}
