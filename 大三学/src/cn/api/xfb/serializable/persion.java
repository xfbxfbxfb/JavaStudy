package cn.api.xfb.serializable;

import java.io.Serializable;

public class persion implements Serializable {
	/*
	 * ���л��ӿ����ã�û�з���������Ҫ���ǣ���һ����ǽӿ�,Ϊ������һ�����л��ӿڡ�
	 * Ψһ���ã���ÿ����Ҫ���л��������һ�����а汾�š�
	 * �汾�����ã�
	 * �����л�ʱ�Ὣ���к�һͬ���浽�ļ��С�
	 * �ڷ����л�ʱ���ȡ��������л��ͱ������ƥ�䣬�����ƥ�佫�׳��쳣��InvalidClassException
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 222l;
	private int age;//ע�⾲̬���ݲ��������л���
	private transient String name;//˲̬�����Ա����л�
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
