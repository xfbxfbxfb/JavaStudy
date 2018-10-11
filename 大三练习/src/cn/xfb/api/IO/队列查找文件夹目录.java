package cn.xfb.api.IO;

import java.io.File;
import java.util.LinkedList;

/*
 * 为解决当文件夹多导致栈溢出。之前用递归方法取出的文件会使栈溢出
 * 内容：
 * 将子目录存入一个容器中在取出来
 */
public class 队列查找文件夹目录 {
	public static void main(String[] args) {
		//创建容器
		Linklistmy<File> link = new Linklistmy<File>();
		//文件夹的目录
		File dir = new File("E:\\java上传图片");
		//将文件存储在列表中
		File[] file = dir.listFiles();
		//遍历文件夹
		for (File f1 : file) {
			//如果是文件夹目录则添加在集合Linklistmy中
			if (f1.isDirectory()) {
				link.myadd(f1);
			}
			//打印文件
			System.out.println(f1.getName());
		}
		//如果文件不是空
		while (!link.Isnull()) {
			//取出文件夹
			File subdir = link.myget();
			//打印文件夹目录
			System.out.println(subdir.getName());
			//将文件夹存入
			File[] file2 = subdir.listFiles();
			//遍历文件目录
			for (File f2 : file2) {
				if (f2.isDirectory()) {
					link.myadd(f2);
				} else {
					System.out.println(f2.getName());
				}
			}
		}
	}
}

// 创建存取子目录的容器
class Linklistmy<E> {
	private LinkedList<E> link;

	public Linklistmy() {
		link = new LinkedList<E>();
	}

	public void myadd(E e) {
		link.addLast(e);
	}

	public E myget() {
		return link.removeFirst();
	}

	public boolean Isnull() {
		return link.isEmpty();
	}

}