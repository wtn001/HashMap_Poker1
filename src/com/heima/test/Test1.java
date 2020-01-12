package com.heima.test;

import java.util.HashMap;

public class Test1 {
	/*需求：统计出每个字符出现的次数（例：aaabbccc）
	 * 分析：
	 * 1定义需要被统计字符的字符串
	 * 2将字符串转换成字符数组
	 * 3定义双列集合（存储出现的字符和字符的次数）
	 * 4遍历字符数组获取每一个字符，并将字符存储在双列集合中
	 * 5存储过程中需要做判断，如果不包含这个键，就将字符当成键，值当做1. 如果包含那键不变，值加一
	 * 6打印双列集合
	 * */
	public static void main(String[] args) {
		// 1定义需要被统计字符的字符串
		String s = "aaaaaaabbbbbbbbbc";
		//2将字符串转换成字符数组
		char[] arr = s.toCharArray();
		//3定义双列集合（存储出现的字符和字符的次数）
		HashMap<Character, Integer> hm = new HashMap<>();
		//4遍历字符数组获取每一个字符，并将字符存储在双列集合中
		
		//普通for循环
		/*for (int i = 0; i < arr.length; i++) {
			if( !hm.containsKey(arr[i]) ) {				//如果不包含C
				hm.put(arr[i], 1);				
			}else {
				hm.put(arr[i],hm.get(arr[i])+1);
			}
		} */
		//增强for循环
		for (char c : arr) {
			if( !hm.containsKey(c) ) {	//如果不包含C
				hm.put(c, 1);				
			}else {
				hm.put(c,hm.get(c)+1);
			}
			
			
			//简化成三元运算符的形式
			//hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
		}
		//6打印双列集合
		System.out.println(hm); 
	}
}
