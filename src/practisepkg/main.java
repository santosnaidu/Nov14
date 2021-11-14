package practisepkg;

public class main {

static void checkage(int age) {
	if (age<18) {
		throw new ArithmeticException("denied - be atleast 18 years old.");
	}
	
	else {
		System.out.println("Granted Access");
	}
}
	
	public static void main(String[] args) {

		checkage(20);
		
	}
	
	
}
