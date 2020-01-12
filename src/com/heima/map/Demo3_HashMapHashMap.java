package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo3_HashMapHashMap {
	public static void main(String[] args) {
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("王添男01",23), "银川");
		hm88.put(new Student("王添男02",23), "银川");
		hm88.put(new Student("王添男03",23), "银川");
		
		HashMap<Student, String> hm99 = new HashMap<>();
		hm99.put(new Student("王添男04",23), "银川");
		hm99.put(new Student("王添男05",23), "银川");
		hm99.put(new Student("王添男06",23), "银川");
		
		//定义最大的集合（集合的集合）
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "88期基础班");
		hm.put(hm99, "99期基础班");
		
		//System.out.println(hm);
		for (HashMap<Student, String> h : hm.keySet()) {
			String value = hm.get(h);			//表示班级
			for (Student s : h.keySet()) {
				String value2 = h.get(s);		//表示地区
				System.out.println(s+"---"+value2+"---"+value);
			}
		}
		
	}
}
