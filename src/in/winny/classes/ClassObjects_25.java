package in.winny.classes;

public class ClassObjects_25 {
//Is the below code written correctly? If yes, what will be the output?
	//Yes. Code is correct.
 
    static void methodOne()
    {
        System.out.println("A");
    }
 
    void methodTwo()
    {
        System.out.println("B");
 
        methodOne();
    }
 
    public static void main(String[] args)
    {
        System.out.println("C");
 
        new ClassObjects_25().methodTwo();
    }
}
