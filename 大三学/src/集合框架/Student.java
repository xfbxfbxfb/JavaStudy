package 集合框架;

public class Student implements Comparable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Student)){ //如果obj的类型与Student类型不相同
			throw new ClassCastException("类型错误");//抛出异常
		}
		Student stu = (Student) obj;//父类转子类

		return this.name.equals(stu.name) && this.age == stu.age;

	}

	@Override
	public int hashCode() {
		
		return 1;
	}

	private String name;
	private int age;

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

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student))
		{
			throw new ClassCastException("类型错误！");
		}
		Student stu = (Student)o;
	//先比较年龄，在按名字顺序来比较
		int temp = this.age - stu.age;
		return temp==0?this.name.compareTo(stu.name):temp;
	}
}
