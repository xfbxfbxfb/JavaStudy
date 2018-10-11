package StringMy;
/*
 * 快捷键Shift+Alt+s
 */
public class StringDemo {
	public static void main(String[] args) {
	Person p = new Person("小明",4);
	Person q = new Person("小明",5);
	
	System.out.println("前一个人比后一个人大"+p.compareTo(q)+"岁");
	System.out.println(p);
	}
}
class Person implements Comparable{
	private String name;
	private int age;
	/*
	 * 以下都是快捷键Shift+Alt+s里面的
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	构造函数带参数的
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//	构造函数不带参数的
	public Person() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/**
	 * 比较年龄大小
	 */
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Person)){//如果o类型不属于Person
			throw new ClassCastException("类型错误");
		}
		Person p   =(Person)o;
		//如果age是String字符串类型下面是将字符串类型转化成int类型
		/*int a = Integer.parseInt(this.age);
		int b = Integer.parseInt(p.age);*/
		return this.age-p.age;
	}
	/**
	 * 判断是否是同一个人
	 * 理由：姓名年龄都一样为一个人
	 */
	@Override
	public boolean equals(Object obj) {//这个
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Person))
		throw new ClassCastException("类型错误");
		Person p  = (Person)obj;
		return this.age==p.age&&this.name.equals(p.name);
	}
	
	
}
