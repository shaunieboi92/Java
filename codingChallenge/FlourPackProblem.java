package codingChallenge;
//error
public class FlourPackProblem {
	public static void main(String []args) {
		if(canPack(5,3,24)) {
			System.out.println("is true");
			
		}else System.out.println("is false");
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount<0 || smallCount<0 ||goal<0) {
			return false;
		}else {
			int sum=bigCount*5+smallCount*1;
			if(sum>=goal) {
				if(smallCount!=0 && bigCount!=0 && bigCount*5<goal && (sum-smallCount)%5==0) {
					return true;
				}else if (smallCount!=0 && bigCount!=0 && bigCount*5>goal && (sum-smallCount)%5==0) {
					return true;
				}else if (smallCount==0 && bigCount!=0 && goal%5==0) {
					return true;
				}else if (smallCount!=0 && bigCount==0 && goal%1==0) {
					return true;
				}
			}
		}return false;
	}
}
//5.3.24
//2.1.5