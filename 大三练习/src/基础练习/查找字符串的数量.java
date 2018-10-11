package 基础练习;

public class 查找字符串的数量 {
	public static void main(String[] args) {
		String strs = "agoodsdagoodjkhkgoodkjgood";
		String key ="good";
	/*	int x = strs.indexOf(key,0);//从头开始找
		System.out.println("x="+x);
		int y = strs.indexOf(key,x+key.length());//从指定位置开始找
		System.out.println("y="+y);
		int z = strs.indexOf(key,y+key.length());//从指定位置开始找
		System.out.println("z="+z);
		int e = strs.indexOf(key,z+key.length());//从指定位置开始找
		System.out.println("e="+e);
		int f = strs.indexOf(key,e+key.length());//从指定位置开始找
		System.out.println("f="+f);//当出现负数时已经查找完毕*/	
/**
 * 查找字符串数量方法
 */
		
		System.out.println(KeyCount(strs,key));
	}

	public static int KeyCount(String strs, String key) {
		int count = 0;//定义关键字数量
		int index = 0;//定义初始位置
		while(strs.indexOf(key,index)!=-1){
			count++;
			index = strs.indexOf(key,index)+key.length();
		}
		return count;	
	}
}
