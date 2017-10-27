
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


public class collecExample4 {
    public static int lowestItem(int[] a) {
    	Set mySet = new HashSet(Arrays.asList(a));
        if(mySet.size()==a.length){
        	return -1;
        } else {
        	mySet = null;
        }
        HashMap map = new HashMap();
        int repeat = -1; 
        int index = -1;
        for(int i=0;i<a.length;i++) {
            if(map.containsKey(a[i])){
            	int numindex = (int) map.get(a[i]);
            	//System.out.println("---numindex:"+numindex+":a[i]:"+a[i]+":i:"+i+":Index:"+index+":Repeat:"+repeat);
            	if(i-numindex==1){
            		return a[i];
            	} else if(index==-1 || index > (i-numindex)) {
            		index = i-numindex;
            		repeat = a[i];
            	} 
            	map.put(a[i],i);
            	//System.out.println("***numindex:"+numindex+":a[i]:"+a[i]+":i:"+i+":Index:"+index+":Repeat:"+repeat);

            } else {
            	map.put(a[i],i);
            }
        }
        return repeat;
    }
    
    
    public static int firstDuplicate(int[] a) {
        for (int i:a){
        	System.out.println("i:"+i+"#Math.abs(i):"+Math.abs(i)+"#a[Math.abs(i)-1]:"+a[Math.abs(i)-1]);
        	if (a[Math.abs(i)-1]<0) 
        		return Math.abs(i);
            a[Math.abs(i)-1]*=-1;
            
        }
        return -1;
    }
    
	public static void main(String[] args) {
		int[] a = {1, 8, 4, 5, 6,11, 3, 2, 3, 2, 1,1};
		System.out.println("a:"+lowestItem(a));
		int[] a1 = {1, 3, 4, 5, 6, 3, 2, 4,8,14, 1};
		// output should be 3
		System.out.println("a1:"+lowestItem(a1));
	    int[] a2 = {1, 3, 4, 5, 6, 8, 7, 9,12,13,14,15,16,17};
		// output should be -1
		System.out.println("a2:"+lowestItem(a2));

		
		System.out.println("a:"+firstDuplicate(a));

		
	}

}
