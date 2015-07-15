package spring_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("----start--");
		TextEditor te  =(TextEditor)context.getBean("textEditor");
		te.spellCheck();
		System.out.println("----end--");
		context.close();
	}
public static void main2(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("----start--");
		TextEditor te  =(TextEditor)context.getBean("textEditor");
		te.spellCheck();
		System.out.println("----end--");
		context.close();
	}
}
