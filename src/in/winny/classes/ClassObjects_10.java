package in.winny.classes;

public class ClassObjects_10 {
	static int staticField = 10;     //Static Field
	 
    //Instance Initialization Block - IIB
 
    {
        //using static field inside IIB
 
        System.out.println(staticField);
    }
    public static void main(String[] args) {
		ClassObjects_10 c =new ClassObjects_10();
		 
	}
}
