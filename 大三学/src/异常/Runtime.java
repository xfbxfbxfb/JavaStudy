package 异常;

/*
 * 原理异常分两种：
 * 1，编译时异常：编译器会检测的异常。
 * 2，运行时异常：编译器不会检测的异常。不需要声明。声明也可以，但要让调用者给出处理方式。
 * 声明：目的是为了让调用者进行处理。
 * 不声明:目的是不让调用者进行处理，就是为了让程序停止，让调用者看到现象，并进行代码的修正。
 * 常见的异常：
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
		// throw new Exception(); //编译时异常
		throw new RuntimeException(); // 不需捕获，不要声明
	}
}