package codingChallenge;

public class WhileDo {
	public static void main(String[] args) {
		/*int count=1;
		while(count!=6) {
			System.out.println("Count value is " + count);
			count++;
		}
		count=1;
		do {
			System.out.println("count value was " + count);
			count++;
			if(count>100) {
			break;}
		}while(count !=6);*/
		
		int number=4;
		int finishNumber=20;
		while(number<=finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}System.out.println(number);
		}//printing all the even number from 4 to 20;
		
	}
	public static boolean isEvenNumber(int number) {
		if(number%2==0) {
			return true;
		}else return false;
	}
}
