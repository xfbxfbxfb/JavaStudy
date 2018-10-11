package ¼¯ºÏ¿ò¼Ü;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet(new TreeSetByLengh());
		set.add("itcast");
		set.add("itcast1");
		set.add("java");
		set.add("javc");
		set.add("s");
		for (Iterator it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());	
		}
	}

}
