
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


public class collecExample {
    public static int[][] rotateImage(int[][] a) {
        System.out.println(a.length);
    	int[][] r = new int[a.length][a.length];
		int k = a.length;
		
	    for (int i=0;i<a.length;++i){
	    	k--;
	    	for(int j=0;j<a.length;++j){
				r[j][k] = a[i][j];			
			}
			
	    }	
        return r;	    
    }

	
    public static int firstNonRepeat(String s){
    	char[] a = new char[s.length()];
    	s.getChars(0, s.length(), a, 0);
    	for(char i:a){
    		System.out.println("character "+i);
    	}
    	for(int i =0;i<a.length;i++){
    		for(int j=i+1;j<a.length;j++){
    			if(a[i]==a[j]){
    				continue;
    			} else {
    				System.out.println("non repeatable no : "+a[i]);
    			}
    		}
    	}
    	System.out.println("nothing matches");
    	return -1;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
    	int[][] aa = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    	
    	for (int i=0;i<aa.length;++i){
			for(int j=0;j<aa.length;++j){
				System.out.print(aa[i][j]+",");			
			}
			System.out.print("\n");
			
	    }
    	
    	aa = rotateImage(aa);
    	
    	
	    for (int i=0;i<aa.length;++i){
			for(int j=0;j<aa.length;++j){
				System.out.print(aa[i][j]+",");			
			}
			System.out.print("\n");
			
	    }
	    
	    
	    
    	
	}

}
