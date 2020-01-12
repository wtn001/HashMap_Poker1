package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo1_HashMap {
	/*需求：HashMap中存储  键是Student，值是String案例
	 * 
	 * */
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("王添男",23), "银川");
		hm.put(new Student("王添男",23), "隆德");
		hm.put(new Student("王亚楠",24), "上海");
		hm.put(new Student("王添男",23), "银川");
		System.out.println(hm);
	}
}
  