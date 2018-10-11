package StringMy;
/*
 * ��ݼ�Shift+Alt+s
 */
public class StringDemo {
	public static void main(String[] args) {
	Person p = new Person("С��",4);
	Person q = new Person("С��",5);
	
	System.out.println("ǰһ���˱Ⱥ�һ���˴�"+p.compareTo(q)+"��");
	System.out.println(p);
	}
}
class Person implements Comparable{
	private String name;
	private int age;
	/*
	 * ���¶��ǿ�ݼ�Shift+Alt+s�����
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
//	���캯����������
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//	���캯������������
	public Person() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/**
	 * �Ƚ������С
	 */
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Person)){//���o���Ͳ�����Person
			throw new ClassCastException("���ʹ���");
		}
		Person p   =(Person)o;
		//���age��String�ַ������������ǽ��ַ�������ת����int����
		/*int a = Integer.parseInt(this.age);
		int b = Integer.parseInt(p.age);*/
		return this.age-p.age;
	}
	/**
	 * �ж��Ƿ���ͬһ����
	 * ���ɣ��������䶼һ��Ϊһ����
	 */
	@Override
	public boolean equals(Object obj) {//���
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Person))
		throw new ClassCastException("���ʹ���");
		Person p  = (Person)obj;
		return this.age==p.age&&this.name.equals(p.name);
	}
	
	
}
