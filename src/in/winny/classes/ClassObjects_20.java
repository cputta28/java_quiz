package in.winny.classes;

public class ClassObjects_20 {

    {
        System.out.println(1);
    }
 
    static
    {
        System.out.println(2);
    }
 
    public ClassObjects_20(int i)
    {
        System.out.println(3);
    }
 
    public ClassObjects_20()
    {
        System.out.println(4);
    }
}
  class ClassTwo
{
    {
        System.out.println(5);
    }
 
    public static void main(String[] args)
    {
        System.out.println(6);
 
        ClassObjects_20 one = new ClassObjects_20();
 
        ClassObjects_20 two = new ClassObjects_20(10);
    }
}
