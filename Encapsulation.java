package TNSIndiaFoundJava;

public class Encapsulation {
    int defaultVariable;
	
	//private
	private int pvtVariable;
	
	//protected
	protected int prtdVariable;
	
	//public
	public int pub_variable;
	
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.sayHello();
		System.out.println(obj.pvtVariable);
		obj.pvt_method();
	}
	
	
	
	
	
	public void sayHello() {
		System.out.println("Hello World from Encapsulation_logic");
	}
	
	// getter function - indirect access ( mai sirf door se dekh raha hu )
	public int get_pvtVariable() {
		return pvtVariable;
	}
	
	//setter
	public void set_pvtVariable(int pvtVariable) {
		this.pvtVariable = pvtVariable;
	}
	
	private void pvt_method() {
		System.out.println("This is a private method");
	}
}
