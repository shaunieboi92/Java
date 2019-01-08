package testing;

//class Dog{ 
//  private String name; 
//  private float height; 
// 
//  public void setName(String takeName){ 
//    name=takeName; 
//  }
//  public void setHeight(float takeHeight){
//     if (takeHeight>=6.0f) {
//       height=takeHeight; 
//      } else{ 
//      height=6.0f; 
//      } 
//  } 
//  public String getName(){
//    return name; 
//  } 
//  public float getHeight(){ 
//  return height; 
//  } 
//}
public class Encapsulation{ 
  public static void main(String[] args) { 
    Dog dog =new Dog(); 
    dog.setName("Rocky"); 
    String dogName=dog.getName(); 
    dog.setHeight(0f); 
    float dogHeight=dog.getHeight();
    
    System.out.println("Name of dog is "+dogName+" with height "+dogHeight+" inches."); 
  }
} 