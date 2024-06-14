package in.winny.inheritance;

public class Inheritance_4 {

    String s = "Class A";
}
 
class B extends Inheritance_4
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class D extends B
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
 
    public static void main(String[] args)
    {
        D c = new D();
 
        System.out.println(c.s);
    }
}
