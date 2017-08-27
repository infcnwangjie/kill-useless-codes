package Inspur;

public class Main {

	public static void main(String[] args) {

		UseValidateInterface uservalidate = new UseValidate();

		ProxyValidate proce = new ProxyValidate(uservalidate);
		UseValidateInterface t1 = (UseValidateInterface) proce.getProxy();
		t1.testValidate();
	}

}
