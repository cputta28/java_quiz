package in.winny.classes;

public class ClassObjects_22 {

	// Is the below class defined correctly
	//No. Constructors can not be called recursively.
   public ClassObjects_22(int i)
{
    this((float)23.5);
}

public ClassObjects_22(float f)
{
    this(28.56);
}

ClassObjects_22(double d)
{
    this(10);
}
}