package 集合框架;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
 * (没有泛型) 
 */

public class Map子类property {
	public static void main(String[] args) throws IOException {

		// 创建一个propertise
		Properties pp = new Properties();
		// 添加数据
		pp.setProperty("xixi", "30");
		pp.setProperty("haha", "32");
		
		//全部取出map- set-- itertor
		Set<String> set = pp.stringPropertyNames();
		
		for (String name : set) {
			String value = pp.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
		methodDeno();
		methodDeno2();

	}
	/**
	 * 使用	Properties中的store把流中的数据进行分割
	 * @throws IOException 
	 * 
	 */
	private static void methodDeno2() throws IOException {
		Properties ppt = new Properties();
		ppt.setProperty("xixi", "30");
		ppt.setProperty("haha", "32");
		FileWriter fw = new FileWriter("E:\\IO\\tempFile\\info.properties");
		ppt.store(fw, "info");
		
	}
	/**
	 *  从输入流中读取属性列表（键和元素对）。使用	Properties中的load方法将流中的数据读取且进行分割。
	 * @throws IOException
	 */
	private static void methodDeno() throws IOException {
		
		Properties ppt = new Properties();
		
		FileReader fr = new FileReader("E:\\IO\\tempFile\\7.partconfig");	
		ppt.load(fr);
		System.out.println(ppt);
		fr.close();
	}
}





