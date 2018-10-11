package 基础练习;

public class IntDemo {
	public static void main(String[] args) {
			
		int sum  =	add(10,43,2,2,23);
		System.out.println(sum);
			
	}
		public static int add(int... arr) {//...代表很多int数据
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
		
}
