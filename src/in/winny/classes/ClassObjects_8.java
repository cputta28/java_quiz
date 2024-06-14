package in.winny.classes;

public class ClassObjects_8 {
	{
        System.out.println("First");//Execute 2
    }
 
    {
        System.out.println("Second");//Execute 3
    }
 
    {
        System.out.println("Third");//Execute 4
    }
 
    public ClassObjects_8()
    {
        System.out.println("Fourth");//Execute 5
    }
 
    public static void main(String[] args)
    {
        System.out.println("Fifth");//Execute 1
 
        ClassObjects_8 a = new ClassObjects_8();
    }
}
