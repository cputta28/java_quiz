package in.winny.classes;

public class ClassObjects_7 {
	{
        System.out.println(1);//Execute second
    }
 
    public ClassObjects_7()
    {
        System.out.println(2);//Execute third
    }
 
    public static void main(String[] args)
    {
        System.out.println(3);//Execute first
 
        ClassObjects_7 a = new ClassObjects_7();
    }
}
