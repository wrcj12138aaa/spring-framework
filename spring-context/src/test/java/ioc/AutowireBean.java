package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author One
 * @description
 * @date 2018/10/28
 */
@Component
public class AutowireBean {
	private String info;

	@Autowired
	private ComponentBean componentBean;

	public ComponentBean getComponentBean() {
		return componentBean;
	}

	public void setComponentBean(ComponentBean componentBean) {
		this.componentBean = componentBean;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public String toString() {
		return "AutowireBean{" +
				"info='" + info + '\'' +
				", componentBean=" + componentBean +
				'}';
	}
}
