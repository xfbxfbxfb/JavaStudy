package cn.api.xfb.serializable;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//���л�
		//writeObject();
		
		//��ȡ�ļ�//�������л�
		readObject();
		

	}

	private static void readObject() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("tempfile\\obj.object");
		ObjectInputStream ois = new ObjectInputStream(fis);//���԰ѷ�˲̬�Ǿ�̬д��
		
		Object obj = ois.readObject();
		System.out.println(obj.toString());
		ois.close();
		
	}


	@SuppressWarnings("unused")
	private static void writeObject() throws IOException {
		
			persion p = new persion(4, "bobo");
			FileOutputStream fos = new FileOutputStream("tempfile\\obj.object");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			fos.close();
		
	}

}
