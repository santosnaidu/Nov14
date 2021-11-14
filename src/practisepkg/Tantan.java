package practisepkg;

import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Tantan {
	
	public static void main(String[] args) {

		HashMap<Integer, String> al=new HashMap<Integer, String>();  
		 
		al.put(2, "hello india");
		al.put(12, "hello india");
		al.put(24, "hello india");
		al.put(6, "hello india");
		al.put(4, "hello india");
		
		
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
	
		}
	}

}
