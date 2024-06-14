package in.winny.classes;

public class ClassObjects_5 {
	static int i;

	static {
		i = 100;

		System.out.println(1);
	}

	static void staticMethod() {
		System.out.println(i);

		System.out.println(2);
	}
}

class B {
	static {
		System.out.println(3);
	}

	public static void main(String[] args) {
		System.out.println(4);

		System.out.println(ClassObjects_5.i);

		ClassObjects_5.staticMethod();
	}
	// OutPut
	/*
	 * 3 4 1 100 100 2
	 */
}
