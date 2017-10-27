

import java.util.TreeMap;

public class childsum extends Parentsum1 {

	
	public static void main(String args[]){
		
		TreeMap tmap = new TreeMap();
		tmap.put(1, 1);
		tmap.put(2, 1);
		tmap.put(2, 2);
		
		System.out.println(tmap.get(2));
	}
	
	
}
