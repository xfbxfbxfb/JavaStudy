package ¼¯ºÏ¿ò¼Ü;

import java.util.LinkedList;


public class Linktest {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		System.out.println(link.removeLast());
		System.out.println(link.removeLast());
		System.out.println(link.removeLast());
		
	}
}
