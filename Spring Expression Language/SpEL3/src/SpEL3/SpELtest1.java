package SpEL3;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELtest1 {
//Expression exp = parser.parseExpression("'You are reading concretepage.com'");
//  String msg = (String) exp.getValue();
  
  public static void main(String[] args) {
    ExpressionParser parser = new SpelExpressionParser();
    //Literal Expression
    Expression exp = parser.parseExpression("'Hi'");
//    String str = (String)exp.getValue(exp); similar result, different way of writing
    String str = exp.getValue(String.class);
    System.out.println("1. Literal expression value: \n" + str);
    
    //Method inv
    //concat methdo
    exp = parser.parseExpression("'Hello'.concat('!')");
    str = exp.getValue(String.class);
    System.out.println("2. Method invocation value: \n" + str  );
    
    //Mathematical operator
    exp = parser.parseExpression("16*5");
    Integer intv = exp.getValue(Integer.class);
    System.out.println("3. Mathematical operator: \n" + intv  );
    
    //Relational Operator
    //Boolean based
    
    exp = parser.parseExpression("5<9");
    Boolean booleanv = exp.getValue(Boolean.class);
    System.out.println("4. Relational operator: \n" + booleanv  );
    
    //Ternary Operator
    exp = parser.parseExpression("'some value'!=null?'some value': 'default'");
    str = exp.getValue(String.class);
    System.out.println("5. Ternary Operator: \n" + str  );
    
 // 8. Regex/matches operator
    exp = parser.parseExpression("'UPPERCASE STRING' matches '[A-Z\\s]+'");
    Boolean boolVal = exp.getValue(Boolean.class);
    System.out.println("8. Regex/matches operator value:\n" + boolVal);
  }
}
