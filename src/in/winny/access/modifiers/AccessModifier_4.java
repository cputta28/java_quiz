package in.winny.access.modifiers;

 public class AccessModifier_4 {

	    protected int i = 1221;
	     
	    void methodOfX()
	    {
	        System.out.println(i);
	    }
	 
	    public static void main(String[] args)
	    {
	    	AccessModifier_4 x = new AccessModifier_4();
	         
	        System.out.println(x.i);
	         
	        x.methodOfX();
	    } }