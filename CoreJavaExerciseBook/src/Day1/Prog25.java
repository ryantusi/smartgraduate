package Day1;

public class Prog25 {
	public static void main(String[] args) {
		//instantiating an object from derived class to ue its method
		derived d = new derived();
		
		d.useD();
	}
}

//protected class base{	This shows illegal modifier, class can only be public, abstract or final
class base{			// so not using protected
	String method() {
		return "Wow";
	}
}

class derived{
	public void useD() {
		base z = new base();
		System.out.println("base says: " + z.method());
	}
}