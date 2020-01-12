package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo3_HashMapHashMap {
	public static void main(String[] args) {
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("������01",23), "����");
		hm88.put(new Student("������02",23), "����");
		hm88.put(new Student("������03",23), "����");
		
		HashMap<Student, String> hm99 = new HashMap<>();
		hm99.put(new Student("������04",23), "����");
		hm99.put(new Student("������05",23), "����");
		hm99.put(new Student("������06",23), "����");
		
		//�������ļ��ϣ����ϵļ��ϣ�
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "88�ڻ�����");
		hm.put(hm99, "99�ڻ�����");
		
		//System.out.println(hm);
		for (HashMap<Student, String> h : hm.keySet()) {
			String value = hm.get(h);			//��ʾ�༶
			for (Student s : h.keySet()) {
				String value2 = h.get(s);		//��ʾ����
				System.out.println(s+"---"+value2+"---"+value);
			}
		}
		
	}
}
