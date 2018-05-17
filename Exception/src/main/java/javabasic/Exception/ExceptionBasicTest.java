package javabasic.Exception;

public class ExceptionBasicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Method START");

		/*
		 * try { int a = 1/0; } catch (Exception e) { System.out.println(
		 * "Catch Exception"); }
		 */
		ExceptionBasicTest test = new ExceptionBasicTest();
		try {
			test.divide();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main Method END");
	}

	public void divide() throws Exception {
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			throw new Exception("zero divde Exception Occurred!!");
		}
	}

}
