package Inspur;

public class UseValidate implements UseValidateInterface {

	@Validate(id = 1)
	public void testValidate() {
		System.out.println("正常业务");
	}
}
