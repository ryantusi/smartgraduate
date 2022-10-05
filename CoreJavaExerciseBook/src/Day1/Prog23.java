package Day1;

public class Prog23 {
	//instantiating an object from the other class to access the protected member
	pro23 pr = new pro23();
	
	//manipualting the protected member through an object
	void manipulate(int a) {
		System.out.println("The number is: " + pr.num);
		System.out.println("Manipulating a protected member from other class...");
		pr.num = a;
		System.out.println(pr.num);
	}
	public static void main(String[] args) {
		//instantiating an object for this class to access the manipulating method
		Prog23 pr23 = new Prog23();
		
		pr23.manipulate(5);		//accessing the method through the object created
		System.out.println("Manipulated Successfully!");
	}
}

//class with protected member
class pro23{
	protected int num = 10;
}

