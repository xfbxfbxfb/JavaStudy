package 基础练习;

public class 冒泡排序 {
	public static void main(String[] args) {

		// 实现冒泡排序：
		// 定义数组
		int arr[] = { 6, 3, 8, 2, 9, 1 };
		// 循环比较轮数
		for (int i = 0; i < arr.length - 1; i++) {
			// 每一轮比较的次数
			for (int j = 0; j < arr.length -1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
