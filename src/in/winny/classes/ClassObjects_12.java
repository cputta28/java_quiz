package in.winny.classes;

public class ClassObjects_12 {

    {
        System.out.println(1);
    }
 
    static
    {
        System.out.println(2);
    }
 
    public ClassObjects_12()
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        System.out.println(4);
 
        ClassObjects_12 a = new ClassObjects_12();
    }
}
