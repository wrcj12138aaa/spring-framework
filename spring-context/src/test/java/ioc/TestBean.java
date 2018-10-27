package ioc;

import javax.inject.Named;

/**
 * @author One
 * @description
 * @date 2018/10/27
 */
@Named
public class TestBean {
	private String name;
	private String age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "TestBean{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
