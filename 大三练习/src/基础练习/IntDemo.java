package ������ϰ;

public class IntDemo {
	public static void main(String[] args) {
			
		int sum  =	add(10,43,2,2,23);
		System.out.println(sum);
			
	}
		public static int add(int... arr) {//...����ܶ�int����
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
		
}
