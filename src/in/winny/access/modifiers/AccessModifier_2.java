package in.winny.access.modifiers;
//Can you find out the error in the below code?

private class AccessModifier_2 { //Inner classes can be private, but outer classes can not be private.

	private class B {
		// Inner class
	}
}