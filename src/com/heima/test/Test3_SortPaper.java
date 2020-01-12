package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3_SortPaper {
	public static void main(String[] args) {
		/*����ģ�⶷����ϴ�Ʒ��ƣ���û��˳��
		 * ������ 
		 * 1ϴ��ǰ������Ҫ���˿��ƣ���Ҫ����һ�����Ϸ����˿���
		 * 2ϴ��
		 * 3����
		 * 4����
		 * 
		 * */
		
	//1ϴ��ǰ������Ҫ���˿��ƣ���Ҫ����һ�����Ϸ����˿���
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"����","����","��Ƭ","÷��"};
		
		HashMap<Integer, String> hm = new HashMap<>();	//Ŀ�ģ��洢  ������ֵ
		ArrayList<Integer> list = new ArrayList<>();	//Ŀ�ģ��洢  ���� �������������൱����ϴ�ƣ�����������ʾֵ���ɣ�
		
		//���ֺͻ�ɫ��ƴ��
		int index = 0;
		for (String s1 : num) {						//��ȡ����
			for (String s2 : color) {				//��ȡ��ɫ
				hm.put(index, s2.concat(s1));
				list.add(index);					//������0--51��ӵ�list������
				index++;
			}
		}
		//���С������
		hm.put(index, "С��");
		list.add(index);							//��52��������ӵ�list��
		hm.put(index+1, "����");
		list.add(index+1);							//��53��������ӵ�list��
	
	//2ϴ��
		Collections.shuffle(list);
	
	//3����
		TreeSet<Integer> person1 = new TreeSet<>();
		TreeSet<Integer> person2 = new TreeSet<>();
		TreeSet<Integer> person3 = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		
		for (Integer i : list) {
			if (i >= list.size() - 3) {
				dipai.add(list.get(i));
			} else if( i % 3 == 0) {
				person1.add(list.get(i));
			} else if( i % 3 == 1) {
				person2.add(list.get(i));
			}else {
				person3.add(list.get(i));
			}
		}
	//4����
		
		lookPoker(hm, person1, "������" );
		lookPoker(hm, person2, "�����" );
		lookPoker(hm, person3, "������" );
		lookPoker(hm, dipai,   "��   ��" );
	}

	public static void lookPoker(HashMap<Integer, String> hm ,TreeSet<Integer> ts ,String name) {
		System.out.print(name + "�����ǣ�");
		for (Integer i : ts) {							//i�������˫�м��ϵ�ÿһ����
			System.out.print( hm.get(i) + " ");		//hm.get���ݼ���ȡֵ
		}
		System.out.println();
		
		
		
		
	}
}
