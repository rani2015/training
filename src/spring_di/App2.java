package spring_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("bean_di.xml");
		System.out.println("----start--");
		TextEditor2 te  =(TextEditor2)context.getBean("textEditor2");
		te.spellCheck();
		System.out.println("----end--");
		context.close();
	}

}
