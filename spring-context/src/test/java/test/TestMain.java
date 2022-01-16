package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hkyzf.spring.beans.Person;

/**
 * @author 朱峰
 * @date 2021-9-14 18:40
 */
public class TestMain {
	public static void main(String[] args) {

	}
	@Test
	public void testXml () {
	    ApplicationContext acx =
				new ClassPathXmlApplicationContext("beans.xml");
		Person person = acx.getBean("person", Person.class);
		System.out.println(person);
	}

	@Test
	public void testConfig () {
		ApplicationContext acx =
				new AnnotationConfigApplicationContext(TestConfig.class);
		Object name = acx.getBean("name");
		System.out.println(name);
	}
}
