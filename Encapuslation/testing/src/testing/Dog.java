package testing;

public class Dog{ 
  private String name; 
  private float height; 
 
  public void setName(String takeName){ 
    name=takeName; 
  }
  public void setHeight(float takeHeight){
     if (takeHeight>=6.0f) {
       height=takeHeight; 
      } else{ 
      height=6.0f; 
      } 
  } 
  public String getName(){
    return name; 
  } 
  public float getHeight(){ 
  return height; 
  } 
}