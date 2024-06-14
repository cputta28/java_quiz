package in.winny.inheritance;

public class Inheritance_3 {
	{
        System.out.println(1);
    }
}
 
class D extends Inheritance_3
{
    {
        System.out.println(2);
    }
}
 
class C extends D
{
    {
        System.out.println(3);
    }
}
 
  class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
