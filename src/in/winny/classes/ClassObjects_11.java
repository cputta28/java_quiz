package in.winny.classes;

public class ClassObjects_11 {
	// Can we give a call to non-static method from a static method
	//No, We can’t call non-static method from a static method.
	static void staticMethod()
    {
        nonStaticMethod();    //Compile time error : can't make static reference to non-static method
    }
 
    void nonStaticMethod()
    {
 
    }
}
