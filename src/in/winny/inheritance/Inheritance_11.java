package in.winny.inheritance;

public class Inheritance_11 {
	static
    {
        System.out.println('A');
    }
 
    {
        System.out.println('B');
    }
 
    public Inheritance_11()
    {
        System.out.println('C');
    }
}
 
class N extends Inheritance_11
{
    static
    {
        System.out.println('D');
    }
 
    {
        System.out.println('E');
    }
 
    public N()
    {
        System.out.println('F');
    }
}
 
  class MainClass
{
    public static void main(String[] args)
    {
        N n = new N();
    }
}
