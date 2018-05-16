package javabasic.ClassLoader;

import java.lang.reflect.Method;

public class ClassLoaderTest1 extends ClassLoader{

	public static void main(String[] args) {
		ClassLoaderTest1 classLoaderTest1 = new ClassLoaderTest1();
		Class<?> klass = null;
		try {
			klass = classLoaderTest1.loadClass("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object obj = null;
		try {
			obj = klass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("String:"+obj.toString());
		Method[] methodArray =  klass.getMethods();
		for (Method method : methodArray) {
			System.out.println(method.toGenericString());
		}
	}

}