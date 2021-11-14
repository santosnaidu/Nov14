package practisepkg;

import java.util.ArrayList;
import java.util.Iterator;


public class august {

	
	public static void main(String[] args) {
		
	ArrayList<Integer> den=new ArrayList<Integer>();
		den.add(1);
		den.add(20);
		den.add(15);
		den.add(40);
		den.add(22);
		System.out.println(den);
		
		
	Iterator<Integer> i=den.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
	
		
	}

	
	
	
}