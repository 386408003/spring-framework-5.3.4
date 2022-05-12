package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hkyzf.spring.beans.Person;

/**
 * 原文件名 TestMain 在新版 Gradle 提示信息如下：
 * No tests found for given includes: [** / *Tests.class, ** / *Test.class](include rules) [test.TestMain.testXml](filter.includeTestsMatching)
 * 故修改文件名为 Test 结尾，或者 Tests 结尾即可。
 * @author 朱峰
 * @date 2021-9-14 18:40
 */
public class MainTest {
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
				new AnnotationConfigApplicationContext(ConfigTest.class);
		Object name = acx.getBean("name");
		System.out.println(name);
	}
}
