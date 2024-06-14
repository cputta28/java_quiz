package in.winny.inheritance;

public class Inheritance_7 {
	static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y extends Inheritance_7
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
 
    public static void main(String[] args)
    {
        Y.staticMethod();
    }
}
