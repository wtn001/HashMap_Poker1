package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2_Paper {
	/*����ģ�⶷����ϴ�Ʒ��ƣ���û��˳��
	 * ������
	 * 1ϴ��ǰ������Ҫ���˿��ƣ���Ҫ����һ�����Ϸ����˿���
	 * 2ϴ��
	 * 3����
	 * 4����
	 * 
	 * */

	public static void main(String[] args) {
	//1ϴ��ǰ������Ҫ���˿��ƣ���Ҫ����һ�����Ϸ����˿���
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"����","����","��Ƭ","÷��"};
		//���е��Ʒ����ڼ�����
		ArrayList<String> poker = new ArrayList<>();
		//ƴ�ӻ�ɫ������
		for (String s1 : color) {				//�û�ɫ
			for (String s2 : num) { 			//������
				poker.add(s1.concat(s2));       //concat��ʾ�������������ַ���	
			}
		}
		poker.add("����");
		poker.add("С��");
	//2ϴ��
		Collections.shuffle(poker);
		
	//3����(�������ˣ����������ϣ������˿��ƾͿ�����)
		ArrayList<String> person1 = new ArrayList<>();
		ArrayList<String> person2 = new ArrayList<>();
		ArrayList<String> person3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for (int i = 0; i < poker.size(); i++) {
			if( i >= poker.size() - 3) {				//�����ŵ��ƴ��ڵ��Ƶļ�����
				dipai.add(poker.get(i));
			}else if ( i % 3 == 0) {					//0 3 6 9����������λ�õ��Ƹ�person1 
				person1.add(poker.get(i));
			}else if ( i % 3 == 1) {					//1 4 7 10����������λ�õ��Ƹ�person2 
				person2.add(poker.get(i));
			}else {										//ʣ�µ��Ƹ�person3
				person3.add(poker.get(i));
			}
		}
	//4����
		System.out.println("person1����:"+person1);
		System.out.println("person2����:"+person2);
		System.out.println("person3����:"+person3);
		System.out.println("��                 ��:"+dipai);
	}
}
