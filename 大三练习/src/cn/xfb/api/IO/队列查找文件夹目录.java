package cn.xfb.api.IO;

import java.io.File;
import java.util.LinkedList;

/*
 * Ϊ������ļ��жർ��ջ�����֮ǰ�õݹ鷽��ȡ�����ļ���ʹջ���
 * ���ݣ�
 * ����Ŀ¼����һ����������ȡ����
 */
public class ���в����ļ���Ŀ¼ {
	public static void main(String[] args) {
		//��������
		Linklistmy<File> link = new Linklistmy<File>();
		//�ļ��е�Ŀ¼
		File dir = new File("E:\\java�ϴ�ͼƬ");
		//���ļ��洢���б���
		File[] file = dir.listFiles();
		//�����ļ���
		for (File f1 : file) {
			//������ļ���Ŀ¼������ڼ���Linklistmy��
			if (f1.isDirectory()) {
				link.myadd(f1);
			}
			//��ӡ�ļ�
			System.out.println(f1.getName());
		}
		//����ļ����ǿ�
		while (!link.Isnull()) {
			//ȡ���ļ���
			File subdir = link.myget();
			//��ӡ�ļ���Ŀ¼
			System.out.println(subdir.getName());
			//���ļ��д���
			File[] file2 = subdir.listFiles();
			//�����ļ�Ŀ¼
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

// ������ȡ��Ŀ¼������
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