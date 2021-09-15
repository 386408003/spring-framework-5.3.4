package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱峰
 * @date 2021-9-14 18:40
 */
@Configuration
public class TestConfig {
	@Bean
	public String name() {
		return "Hello Spring.";
	}
}
