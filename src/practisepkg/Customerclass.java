package practisepkg;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Customerclass  {


		public static void main(String[] args) {
			
			HashMap<Integer,String> pen=new HashMap<Integer,String>();	
			TreeMap<Integer,String> den=new TreeMap<Integer,String>();
			
			
			
		pen.put(01, "apple");
		pen.put(04, "banana");
		pen.put(03, "cat");
		pen.put(02, "dhoom");
		pen.put(05, "europe");
		pen.put(06, "finland");
		
		
		den.put(01, "ant");
		den.put(02, "barrow");
		den.put(03, "camel");
		den.put(04, "dhoom");
		den.put(05, "elegant");
		den.put(06, "furious");
		
		
		
			
			
			System.out.println(pen);
			System.out.println(den);
			
			
		}
		
	
}


