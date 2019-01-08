package testing;

//correct example
public class tester4 {
  public static void main(String[] args) {
    Weighter ob = new Weighter();

    ob.setWeight(-1);
    System.out.println(ob.getWeight());

    ob.weightENCODED = -5;// illegal//unknown
    System.out.println(ob.getWeight());// there will be no change

  }
}

// private only visible within class
// private hides from other class within the package,
// class defined here is as good as another public class, whose private
// attributes are not visible by tester4
class Weighter {
  private int weightENCODED;// made private

  public int getWeight() {
    return weightENCODED;
  }

  public void setWeight(int weightENCODED) {
    if (weightENCODED < 0) {
      System.out.println("error");
      weightENCODED = 50;
    }
    else
      this.weightENCODED = weightENCODED;
    // logic here
  }
}
