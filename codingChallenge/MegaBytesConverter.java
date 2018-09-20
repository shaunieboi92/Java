package codingChallenge;

public class MegaBytesConverter {
	public static void main(String[] args) {
	printMegaBytesAndKiloBytes(5000);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int XX=kiloBytes;
		int YY=XX/1024	;
		int ZZ =XX%1024;
		if(kiloBytes < 0) {
			System.out.println("invalid Value");
		}else {
		
		System.out.println(XX + "KB = " + YY + "MB and " + ZZ + "KB.");
		}
	}
}
