package cn.api.system;

import java.util.Random;

public class Mathuse {
		public static void main(String[] args) {
		//���ؾ���ֵ
		int a =	Math.abs(-45);
		double b =Math.abs(45);
		System.out.println("���ؾ���ֵa="+a+"  b="+b);
		
		//����ָ������
		System.out.println("5��3�η�"+(int)Math.pow(5, 3));
		//���������
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			//�����������0��6֮��
			int r1 = r.nextInt(6)+1;
			System.out.print(r1);
		  }
		}
}
