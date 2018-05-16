package javabasic.ClassLoader;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomClassLoader extends ClassLoader
{
	public static void main(String[] args)
	{
		CustomClassLoader ccl = new CustomClassLoader();
		try
		{
			ccl.loadClass("com.gilbut.pkg.Hello").newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public CustomClassLoader()
	{
		super(CustomClassLoader.class.getClassLoader());
	}

	public CustomClassLoader(ClassLoader parent)
	{
		super(parent);
	}

	protected Class<?> findClass(String name) throws ClassNotFoundException
	{
		try
		{
			String path = "C:/test.jar";
			FileInputStream file = new FileInputStream(path);
			byte[] classByte = new byte[file.available()];
			file.read(classByte);
			file.close();
			return defineClass(name, classByte, 0, classByte.length);
		}
		catch (IOException ex)
		{
			throw new ClassNotFoundException();
		}
	}
}