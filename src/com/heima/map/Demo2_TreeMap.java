package com.heima.map;

import java.util.TreeMap;

import com.heima.bean.Student;

public class Demo2_TreeMap {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("������",23), "����");
		tm.put(new Student("������",23), "����");
		
		System.out.println(tm);
	}
}
