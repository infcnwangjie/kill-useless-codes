package Inspur;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyValidate implements InvocationHandler {

	private Object target;

	public ProxyValidate(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (target instanceof UseValidate) {
			ValidateProcess.processValidate((UseValidate) target);
		}

		Object result = method.invoke(target, args);

		System.out.println("has finish");

		return result;
	}

	public Object getProxy() {

		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

}
