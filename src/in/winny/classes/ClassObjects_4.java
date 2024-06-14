package in.winny.classes;

 public class ClassObjects_4 {
	static int first;

	static String second;

	static {
		System.out.println(1);

		first = 100;
	}

	static {
		System.out.println(2);

		second = "SECOND";
	}
}

class StaticInitializationBlock {
	static {
		System.out.println(3);
	}

	public static void main(String[] args) {
		System.out.println(4);

		System.out.println(ClassObjects_4.first);

		System.out.println(ClassObjects_4.second);
	}
	//OutPut 
	/*
	 * 3 4 1 2 100 SECOND
	 */
}
