//class.forname을 통해 찾으려는 클래스를 classpath 옵션으로 지정해서 실행시키는 예제

package javabasic.ClassLoader;

public class ClassForNameTest {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("ClassForNameTest START");
			Class<?> clazz = Class.forName("InterfaceTest");
			
			String params = null;
			clazz.getMethod("main", String[].class).invoke(null, (Object)params);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
