package com.heima.test;

import java.util.HashMap;

public class Test1 {
	/*����ͳ�Ƴ�ÿ���ַ����ֵĴ���������aaabbccc��
	 * ������
	 * 1������Ҫ��ͳ���ַ����ַ���
	 * 2���ַ���ת�����ַ�����
	 * 3����˫�м��ϣ��洢���ֵ��ַ����ַ��Ĵ�����
	 * 4�����ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
	 * 5�洢��������Ҫ���жϣ������������������ͽ��ַ����ɼ���ֵ����1. ��������Ǽ����䣬ֵ��һ
	 * 6��ӡ˫�м���
	 * */
	public static void main(String[] args) {
		// 1������Ҫ��ͳ���ַ����ַ���
		String s = "aaaaaaabbbbbbbbbc";
		//2���ַ���ת�����ַ�����
		char[] arr = s.toCharArray();
		//3����˫�м��ϣ��洢���ֵ��ַ����ַ��Ĵ�����
		HashMap<Character, Integer> hm = new HashMap<>();
		//4�����ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
		
		//��ͨforѭ��
		/*for (int i = 0; i < arr.length; i++) {
			if( !hm.containsKey(arr[i]) ) {				//���������C
				hm.put(arr[i], 1);				
			}else {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
		} */
		//��ǿforѭ��
		for (char c : arr) {
			if( !hm.containsKey(c) ) {	//���������C
				hm.put(c, 1);				
			}else {
				hm.put(c,hm.get(c)+1);
			}
			
			
			//�򻯳���Ԫ���������ʽ
			//hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
		}
		//6��ӡ˫�м���
		System.out.println(hm); 
	}
}
