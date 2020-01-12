package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		
		Collections.sort(list);
		
		System.out.println(Collections.binarySearch(list, "a"));
		
		System.out.println( Collections.max(list));
		
		Collections.reverse(list);
		
		Collections.shuffle(list);	//Ëæ¼´»»
		System.out.println(list);
	}
}
