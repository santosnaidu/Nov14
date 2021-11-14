package practisepkg;

public class animal {
	public static void main(String[] args) {
		

	int a=10;
	int b=6;
	
	try {
	int c=10/0;
	System.out.println(c);
	}catch(ArithmeticException dan) {
		System.out.println(dan);
	} catch(Exception rem) {
		System.out.println("print whatever it is");
	} finally {
		System.out.println("Final will print everything regardless of any");
	}

	
	//GITHUB Branch practise
	
	
	
	}
}
