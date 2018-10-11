package cn.api.xfb.serializable;

import java.io.Serializable;

public class persion implements Serializable {
	/*
	 * 序列化接口作用：没有方法，不需要覆盖，是一个标记接口,为了启动一个序列化接口。
	 * 唯一作用，给每个需要序列化的类分配一个序列版本号。
	 * 版本号作用：
	 * 在序列化时会将序列号一同保存到文件中。
	 * 在反序列化时会读取到这个序列化和本类进行匹配，如果不匹配将抛出异常。InvalidClassException
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 222l;
	private int age;//注意静态数据不可以序列化的
	private transient String name;//瞬态不可以被序列化
	public persion(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "persion [age=" + age + ", name=" + name + "]";
	}
	

}
