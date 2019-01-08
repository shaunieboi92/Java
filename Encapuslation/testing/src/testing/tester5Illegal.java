package testing;

public class tester5Illegal {
  public int weight;

  //no need for setters and getters
  
  public static void main(String[] args) {
    tester5Illegal ox = new tester5Illegal();
    ox.weight = -1;//weight can be changed as and when
    System.out.println(ox.weight);
  }
}
