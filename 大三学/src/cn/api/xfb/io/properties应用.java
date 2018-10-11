package cn.api.xfb.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties应用 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * 定义程序运行次数，当程序运行次数达到指定的次数输出，试用次数已到，请注册
		 */
		
		if(isStop()) {
			System.out.println("试用次数已到请注册！");
		}
		else {
		
		runcode();
		}
	}

	private static boolean isStop() throws IOException {
		//配置文件
		File configFile = new File("E:\\IO\\新建文件夹\\1.txt");
		if(!configFile.exists()) {
			configFile.mkdirs();
		}
		//创建属性集
		Properties prop = new Properties();
		
		//定义读取流和配置文件关联//读取文件
		FileInputStream fis = new FileInputStream(configFile);
		
		//将关联数据读取到属性集中
		prop.load(fis);
		
		//根据属性集指定的键来获取具体的次数
		String value = prop.getProperty("count");
		int count = 0 ;
		if(value!=null) {
			
			count = Integer.parseInt(value);//转为整数
			if(count>3) {
				return true;
			}
		}
		count++;
		//自增后将值放到属性集中
		prop.setProperty("count", Integer.toString(count));
		//将属性集放到文件中
		FileOutputStream fos = new FileOutputStream(configFile);
		prop.store(fos, "软件运行的次数！");
		//关闭流
		fos.close();
		fis.close();
		return false;
	}

	private static void runcode() {
		System.out.println("程序运行中！");
		
	}

}







