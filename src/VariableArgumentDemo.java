
public class VariableArgumentDemo {
	public static void main(String[] args) {
		int a= 5;		//argument
		mymethod(7,"Hello, World",'A',89.5 , false);
	}
	static void mymethod(Object ... array) {	//parameter
		for(Object temp : array) {
			System.out.println(temp);
		}
	}
}
