package codingChallenge;

public class PlayingCat {
	
	public static void main(String[] Args) {
		isCatPlaying(false,35);
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer) {
			if(temperature>=25 && temperature <=45) {
				System.out.println("The cat is playing in summer");
				return true;
			}else {
				System.out.println("Not playing");
				return false;
			}
		}else if(temperature >=25 && temperature <=35) {
			System.out.println("The cat is playing in non summer");
			return true;
		}else {
			System.out.println("Not playing");
			return false;
		}
	}
}
