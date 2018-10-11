package ���Ͽ��;

public class Student implements Comparable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Student)){ //���obj��������Student���Ͳ���ͬ
			throw new ClassCastException("���ʹ���");//�׳��쳣
		}
		Student stu = (Student) obj;//����ת����

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
			throw new ClassCastException("���ʹ���");
		}
		Student stu = (Student)o;
	//�ȱȽ����䣬�ڰ�����˳�����Ƚ�
		int temp = this.age - stu.age;
		return temp==0?this.name.compareTo(stu.name):temp;
	}
}
