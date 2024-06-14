package in.winny.classes;

public class ClassObjects_13 {
	//How many instance initializers (IIB) are there in the below class
	char c = 'A';     //------&gt; (1)
	 
    {
        c = 'B';      //------&gt; (2)
    }
 
    {
        c = 'C';      //------&gt; (3)
    }
     
}
