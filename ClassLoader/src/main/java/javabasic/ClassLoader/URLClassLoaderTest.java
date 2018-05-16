//urlclassloader를 통해 원하는 클래스를 로딩해서 메인메소드를 실행시키는 예제

package javabasic.ClassLoader;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {

	public static void main(String[] args) throws Exception {
		URL[] urls = {new File("D:/workspace_http/TEST/bin").toURI().toURL()};
		URLClassLoader urlClassLoader = new URLClassLoader(urls);

		for (URL url : urlClassLoader.getURLs()) {
			System.out.println("url:"+url.toString());
		}
		
		Class<?> clazz = urlClassLoader.loadClass("InterfaceTest");
//		Object obj = clazz.newInstance();
		String params = null;
		clazz.getMethod("main", String[].class).invoke(null, (Object)params);
		System.out.println("test");
		
		urlClassLoader.close();
	}

}
