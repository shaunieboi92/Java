package testing;

class tester2 {
  public tester2() {
    
  }
  
}

enum tester3{
  // Validation Service Request
  VALIDATION_REQUEST,

  // NTP Message Request with CDATA
  NTP_MESSAGE_REQUEST;
}
  
class tester{
  private tester3 x;
  
  public tester(tester3 x) {
    super();
    this.x= x;
  }
  public tester3 getX() {
    return x;
  }

  
  public static void main(String[] args) {
    tester3 b = tester3.VALIDATION_REQUEST;
    //first test
    tester4 A = new tester4();
    tester4 B = new tester4();
    tester C = new tester(b);

    System.out.println(A.equals(B));
    
    //2nd test
    System.out.println(C.isTrue(b));
    
  }
  
  public boolean isTrue(tester3 requestType) {
    return tester3.VALIDATION_REQUEST.equals(requestType);
  }


}
