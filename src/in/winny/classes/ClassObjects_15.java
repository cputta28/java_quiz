package in.winny.classes;

public class ClassObjects_15 {
	{
        System.out.println(1);
 
        id = 1001;
    }
 
    static
    {
        System.out.println(2);
 
        name = "NAME";
    }
 
    static String name;
 
    public ClassObjects_15(String name, int id)
    {
        System.out.println(3);
 
        this.name = name;
 
        this.id = id;
    }
 
    int id;
 
    {
        System.out.println(4);
 
        System.out.println(id);
    }
 
    static
    {
        System.out.println(5);
 
        System.out.println(name);
    }
 
    public static void main(String[] args)
    {
        System.out.println(6);
 
        ClassObjects_15 a = new ClassObjects_15("MyName", 1111);
    }
}
