package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo1_HashMap {
	/*����HashMap�д洢  ����Student��ֵ��String����
	 * 
	 * */
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("������",23), "����");
		hm.put(new Student("������",23), "¡��");
		hm.put(new Student("�����",24), "�Ϻ�");
		hm.put(new Student("������",23), "����");
		System.out.println(hm);
	}
}
  