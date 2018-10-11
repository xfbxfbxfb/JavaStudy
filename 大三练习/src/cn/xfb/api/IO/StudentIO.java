package cn.xfb.api.IO;

public class StudentIO implements Comparable<StudentIO>{
	private String name;
	private int cn,en,su,sum;
	public StudentIO(String name, int cn, int en, int su) {
		super();
		this.name = name;
		this.cn = cn;
		this.en = en;
		this.su = su;
		this.sum = cn+en+su;
	}
	public StudentIO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCn() {
		return cn;
	}
	@Override
	public String toString() {
		return "StudentIO [name=" + name + ", sum=" + sum + "]";
	}
	public void setCn(int cn) {
		this.cn = cn;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public int compareTo(StudentIO o) {
		int temp = this.sum-o.sum;
		return temp==0?this.name.compareTo(o.name):temp;
	}

	
}
