
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


public class collecExample2 {
    public static int lowestItem(int[] a) {
    	Set mySet = new HashSet(Arrays.asList(a));
        if(mySet.size()==a.length){
        	return -1;
        }
        int repeat = -1; 
        int index = -1;
        for(int i=0;i<a.length;i++) {
            int b = a[i];
            for(int j=i+1;j<a.length;j++){
                if(b==a[j] && (j-i)==1){
                    return b;
                } else if (b==a[j] && index==-1) { 
                    index = j-1;
                    repeat = b;
                    break;
                } else if (b==a[j] && index!=-1 && (j-1)<index){
                    index = j-1;
                    repeat = b;
                    break;
                }
            }
        } 
        return repeat;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] a = {1, 8, 4, 5, 6, 3, 2, 2, 1};
		System.out.println("a"+lowestItem(a));

		int[] a1 = {1, 3, 4, 5, 6, 3, 2, 4, 1};
		// output should be 3
		System.out.println("a1"+lowestItem(a1));
	    int[] a2 = {1, 3, 4, 5, 6, 8, 7, 9,12,13,14,15,16,17};
		// output should be -1
		System.out.println("a"+lowestItem(a2));

	}

}
