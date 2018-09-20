package codingChallenge;

public class SumFirstLastDigit {
	public static void main(String[]args) {
		int x=sumFirstAndLastDigit(5);
		System.out.println(x);
	}
	
	public static int sumFirstAndLastDigit(int number) {
	    if(number<0){
	        return -1;
	    }else if((int)Math.log10(number)+1>=2){
	        int lastD = number%10;
	        int firstD = number/(int)Math.pow(10, (int)Math.log10(number));
    	    return lastD +firstD;
	    }else if ((int)Math.log10(number)+1==1) {
	    	return number*2;
	    }else return 0;
    }
}
