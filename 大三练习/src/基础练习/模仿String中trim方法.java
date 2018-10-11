package 基础练习;
/*
 * 模仿String中的trim方法
 * 首先知道trim的方法作用
 * trim方法：经查API知作用为将字符串的前后空白即空格进行删除返回字符串，
 */
public class 模仿String中trim方法 {
		public static void main(String[] args) {
			String str = "   jkhkjfsd   ";
			//String str2 = str.trim();
			String str2 =getArray(str);
			System.out.println("--"+str2+"--");
		}

		private static String getArray(String str) {
			//思路对首尾进行判断是否为空格
			int start = 0;
			int end = str.length()-1;
			//当开始位置不等于空，并且开始地址不大于结束地址则开始位置++
			while(str.charAt(start)==' '&& start<=end)
				start++;
			while(str.charAt(end)==' '&& start<=end)
				end--;
			//截取开始与结尾字符串
			String str3 = str.substring(start,end);
			return str3;
		}
}
