package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.hkyzf.spring.beans.Person;
import top.hkyzf.spring.beans.Student;

import java.util.UUID;

/**
 * ComponentScan 用来指定 Spring 启动时的 bean 组件扫描路径，只有在这个包路径下的配置类才会被加载
 *
 * @author 朱峰
 * @date 2021-9-14 18:40
 */
@Configuration
@ComponentScan(basePackages = "top.hkyzf.spring.beans")
public class ConfigTest {
	@Bean
	public String name() {
		return "Hello Spring.";
	}

	/**
	 * 注意几点：
	 * (1)此处的方法不能是private或者final修饰的，否则会提示异常
	 * (2) 使用该方法创建完成的bean，默认的bean的名称为方法名，即：person
	 * (3) 如果需要在创建的过程中，加入一些逻辑，可以直接在方法中完成
	 * (4) 方法的返回值类型为bean对应的类型
	 * @return Person 对象
	 */
	@Bean
	public Person person() {
		Person person = new Person();
		person.setUuid(UUID.randomUUID().toString());
		return person;
	}

	/**
	 * @ Bean 指定 bean 的名称，初始化方法及销毁方法
	 * @ Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	 * 每次从容器中获取时，都会重新创建一个新的 Bean 实例。
	 * @ Lazy
	 * 注解标注之后，默认的 value 为 true，即开启了 bean 的延迟创建
	 */
	@Bean(value = "student",
			initMethod = "initStudent",
			destroyMethod = "destroyStudent")
	public Student student() {
		Student s = new Student();
		System.out.println("Student create...");
		s.setName(UUID.randomUUID().toString());
		return s;
	}
}
