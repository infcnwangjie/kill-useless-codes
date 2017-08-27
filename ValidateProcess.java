package Inspur;

import java.lang.reflect.Method;

public class ValidateProcess {

	public static void processValidate(UseValidate uservalidate) {

		for (Method m : UseValidate.class.getDeclaredMethods()) {
			Validate validate = m.getDeclaredAnnotation(Validate.class);
			if (validate != null) {
				System.out.println("其他业务逻辑，比如处理一些模板代码等等");
			}
		}

	}
}
