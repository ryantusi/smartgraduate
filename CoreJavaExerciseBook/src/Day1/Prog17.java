package Day1;

import java.security.DomainCombiner;

public class Prog17 {
	static int d = 10; 	// no error, since this is allowed
	public static void main(String[] args) {
		final int n  = 100; // constant variable
		//n =10; 	error, constants cannot be changed at all 
		
		int a = 10; //static member inside a static method
	}
	
	int test(int b) {
		//static int c = b;	error, static is not allowed inside a non-static class or method
		//static is only allowed outside 
		return 0;
	}
	
	//trying to instantiate object of test class without parameter
	test ts = new test();
	//ts.test();	shows an error
}

//create a class
class test{
	int test(int i){
		return i;
	}
}
