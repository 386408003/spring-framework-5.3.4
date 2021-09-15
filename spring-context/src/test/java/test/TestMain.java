package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 朱峰
 * @date 2021-9-14 18:40
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext acx =
				new AnnotationConfigApplicationContext(TestConfig.class);
		Object name = acx.getBean("name");
		System.out.println(name);
	}
}
