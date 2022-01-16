package top.hkyzf.spring.beans;

/**
 * @author 朱峰
 * @date 2022-1-16 2:08
 */
public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	/**
	 * 初始化方法，在Student实例创建完，
	 * name属性设置完成之后初始化的时候执行
	 */
	public void initStudent() {
		System.out.println("Student init...");
	}

	/**
	 * 在调用容器的close方法关闭容器销毁bean的时候执行
	 */
	public void destroyStudent() {
		System.out.println("Student destory...");
	}
}

