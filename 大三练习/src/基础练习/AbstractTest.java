package 基础练习;
/*
 * 要求：小敏：年龄，名字，做作业。小波：年龄，名字，做作业，睡觉。
 * 写一个程序描述
 */

public class AbstractTest {
	public static void main(String[] args) {

		XiaoMing xm = new XiaoMing(20, "小敏");
		xm.work();

		XiaoBo xb = new XiaoBo(21, "小波");
		xb.work();
	}
}

abstract class Student {

	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	abstract void work();
}

class XiaoMing extends Student {

	public XiaoMing(int age, String name) {
		super(age, name);
		System.out.println("我是" + name + "我今年" + age + "岁");
	}

	@Override
	void work() {
		System.out.println("我是在工作");

	}
}

class XiaoBo extends Student {
	private String w = "碎觉";

	public XiaoBo(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
		System.out.println("我是" + name + "我今年" + age + "岁");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("我是在工作和有时在" + w);

	}

}