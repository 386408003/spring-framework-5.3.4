package top.hkyzf.spring.beans;

/**
 * @author 朱峰
 * @date 2022-1-16 1:50
 */
public class Person {
	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Person{" +
				"uuid='" + uuid + '\'' +
				'}';
	}
}

