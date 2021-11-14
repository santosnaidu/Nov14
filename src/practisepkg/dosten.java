package practisepkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class dosten extends dost{
	

	public static void main(String[] args) {
			
	List<String> pen=new LinkedList<String>();
	List<Integer> den=new LinkedList<Integer>();
	Set<Integer> app=new HashSet<Integer>();
	Set<Integer> kenya=new LinkedHashSet<Integer>();
	//importing java.util package
	
	pen.add("hello world");
	pen.add("kia motors");
	pen.add("indian");
	
	den.add(12);
	den.add(33);

	System.out.println(pen);
	System.out.println(den);
	
	app.add(120);
	app.add(1200);
	app.add(88);
	app.add(55);
	System.out.println(app);
		
		
	}
}

