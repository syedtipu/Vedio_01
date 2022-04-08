package Practice;

import java.util.HashMap;

public class P2 {

	public static void main(String[] args) {
     HashMap<Integer, String> Members = new HashMap<Integer, String>();
     Members.put(101, "Raju");
     Members.put(102, "Radwan");
     Members.put(103, "Taher");
     Members.put(104, "Tipu");
     
     System.out.println(Members.size());
     
     for (Integer i : Members.keySet()) { 
    	 
    	 System.out.println(i + "  " +   Members.get(i));
    	 
     }
		
			

		

	}

}
