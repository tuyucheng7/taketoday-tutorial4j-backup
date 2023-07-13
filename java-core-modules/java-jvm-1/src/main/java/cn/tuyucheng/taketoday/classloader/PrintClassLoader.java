package cn.tuyucheng.taketoday.classloader;

import java.util.ArrayList;

public class PrintClassLoader {

	public void printClassLoaders() throws ClassNotFoundException {
		System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
		System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());
	}
}