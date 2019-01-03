package test2;

import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
public class SpEL {

	public static void main(String[] args) {
		//instantiate Date object
		ExpressionParser parser = new SpelExpressionParser();

		GregorianCalendar c = new GregorianCalendar();
		c.set(1956, 2 ,3);
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		Expression exp4 = parser.parseExpression("name");
		EvaluationContext context = new StandardEvaluationContext(tesla);
		String name = (String)exp4.getValue(context);
	
		Expression exp = parser.parseExpression("'You are reading concretepage.com'");
		String msg = (String) exp.getValue();
		
		Expression exp2 = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp2.getValue();
		
		Expression exp3 = parser.parseExpression("'Hello World'.bytes.length");  
		int length = (Integer) exp3.getValue();
		
		System.out.println("String msg: " + msg);
		
		System.out.println("Byte msg: " + bytes);

		System.out.println("Byte length msg: " + length);
		
		System.out.println("Name is " + name);

	}

	
}

class Inventor {
	private String name;
	private Date birthday;
	private String nationality;
	//create constructor
	Inventor(String name, Date birthday, String nationality){
		this.name = name;
		this.birthday = birthday;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	

	//  The constructor arguments are name, birthday, and nationality.

	
//	String name = (String) exp.getValue(context);
}