package in.winny.classes;

public class ClassObjects_6 {
	 //SIB - Static Initialization Block
    static
    {
        staticmethod();   //Invoking static method inside SIB
    }
 
    static void staticmethod()
    {
        System.out.println("It is a static method");
    }
    public static void main(String[] args) {
ClassObjects_6.staticmethod();		
	}
}
