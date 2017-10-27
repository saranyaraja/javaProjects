

public class Parentsum1 {

	private int offset = -1;
	
	public int sum (int a, int b){
		return a+b+offset;
		
	}
	
	public Parentsum1(){
		offset = 0;	
	}
	
	public Parentsum1(int offset){
		this.offset = offset;
	}
	
	public void setOffset(int setvalue){
		this.offset = setvalue;
	}
	
	public int getOffset(){
		return this.offset;
	}
	
	
	
}
