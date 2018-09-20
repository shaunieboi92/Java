package codingChallenge;

public class BarkingDog {
	public static void main(String[] args) {
		
		bark(true,1);
		}
		public static boolean bark(boolean barking, int hourOfDay) {
			if(hourOfDay>=0 && hourOfDay <=23) {
				if(hourOfDay<8 || hourOfDay>22) {
					if(barking == true) {
						return true;
					}else {
						return false;
					}
					
				}else {
					return false;
				}
			}else {
				return false;
			}
				
		}
}
