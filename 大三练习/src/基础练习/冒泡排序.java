package ������ϰ;

public class ð������ {
	public static void main(String[] args) {

		// ʵ��ð������
		// ��������
		int arr[] = { 6, 3, 8, 2, 9, 1 };
		// ѭ���Ƚ�����
		for (int i = 0; i < arr.length - 1; i++) {
			// ÿһ�ֱȽϵĴ���
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
