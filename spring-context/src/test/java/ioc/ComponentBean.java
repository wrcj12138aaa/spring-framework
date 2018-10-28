package ioc;

import org.springframework.stereotype.Component;

/**
 * @author One
 * @description
 * @date 2018/10/27
 */
@Component
public class ComponentBean {

	private String name = "a";
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
		return "ComponentBean{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
