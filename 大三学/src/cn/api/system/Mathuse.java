package cn.api.system;

import java.util.Random;

public class Mathuse {
		public static void main(String[] args) {
		//返回绝对值
		int a =	Math.abs(-45);
		double b =Math.abs(45);
		System.out.println("返回绝对值a="+a+"  b="+b);
		
		//计算指数函数
		System.out.println("5的3次方"+(int)Math.pow(5, 3));
		//返回随机数
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			//返回随机数在0和6之间
			int r1 = r.nextInt(6)+1;
			System.out.print(r1);
		  }
		}
}
