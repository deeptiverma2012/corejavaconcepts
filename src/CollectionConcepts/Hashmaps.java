package CollectionConcepts;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("E0123", "Deepti");
		hm.put("E0124", "Rick");
		hm.put("E0125", "Nick");
		hm.put("E0122", "Nicky");
		System.out.println(hm.get("E0123"));  
		System.out.println(hm.get("E0126"));// It'll return null because key that we are passing "E0126" does not exists
		System.out.println(hm);// We can directly print hashmap
		
		HashMap<Integer, String> hm1 = new 	HashMap<Integer, String>();
	     hm1.put(1, "Ravi");
	     hm1.put(2, "Suraj");
	     hm1.put(3, "Bhaskar");
	     hm1.put(1, "Ravinder");// It will overlap the existing value with the existing key
	     hm1.put(1, "Pratap");
	     hm1.put(4, null);
	     hm1.put(5, null);
	     hm1.put(null, null);
	     hm1.put(null, "Seema");
	     hm1.put(null, null);// Only one null key is allowed. if we add a second record with null key, it will override the last saved records with the latest one
	     
	     
	     
	    System.out.println( hm1.get(1));
	    System.out.println( hm1.get(2));
	    System.out.println( hm1.get(3));
		System.out.println(hm1);

 

}
}