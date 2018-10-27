package ioc;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author One
 * @description
 * @date 2018/10/27
 */
public class IoCLab {

	@Test
	public void testIoC() {
		AnnotationConfigApplicationContext ctx = new
				AnnotationConfigApplicationContext("ioc.");
		AutowireBean bean = ctx.getBean(AutowireBean.class);
		System.out.println(bean);
		TestBean bean1 = ctx.getBean(TestBean.class);
		System.out.println(bean1);
	}
}
