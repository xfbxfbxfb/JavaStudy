package �쳣;

/*
 * ԭ���쳣�����֣�
 * 1������ʱ�쳣��������������쳣��
 * 2������ʱ�쳣����������������쳣������Ҫ����������Ҳ���ԣ���Ҫ�õ����߸�������ʽ��
 * ������Ŀ����Ϊ���õ����߽��д���
 * ������:Ŀ���ǲ��õ����߽��д�������Ϊ���ó���ֹͣ���õ����߿������󣬲����д����������
 * �������쳣��
 * ArrayIndexOutOfBoundException
 * IllegalArgumetException
 * NullPointException
 * ClassCastException
 */
public class Runtime {

	public static void main(String[] args) {
		int arr[] = { 1, 7, 9 };
		System.out.println(arr[3]);
	}
}
class Demo {
	void show() {
		// throw new Exception(); //����ʱ�쳣
		throw new RuntimeException(); // ���貶�񣬲�Ҫ����
	}
}