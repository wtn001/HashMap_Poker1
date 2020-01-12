package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3_SortPaper {
	public static void main(String[] args) {
		/*需求：模拟斗地主洗牌发牌，牌没有顺序
		 * 分析： 
		 * 1洗牌前提是需要有扑克牌，需要定义一个集合放置扑克牌
		 * 2洗牌
		 * 3发牌
		 * 4看牌
		 * 
		 * */
		
	//1洗牌前提是需要有扑克牌，需要定义一个集合放置扑克牌
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		
		HashMap<Integer, String> hm = new HashMap<>();	//目的：存储  索引和值
		ArrayList<Integer> list = new ArrayList<>();	//目的：存储  索引 （打乱索引就相当于是洗牌，根据索引显示值即可）
		
		//数字和花色的拼接
		int index = 0;
		for (String s1 : num) {						//获取数字
			for (String s2 : color) {				//获取颜色
				hm.put(index, s2.concat(s1));
				list.add(index);					//将索引0--51添加到list集合中
				index++;
			}
		}
		//添加小王大王
		hm.put(index, "小王");
		list.add(index);							//将52的索引添加到list中
		hm.put(index+1, "大王");
		list.add(index+1);							//将53的索引添加到list中
	
	//2洗牌
		Collections.shuffle(list);
	
	//3发牌
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
	//4看牌
		
		lookPoker(hm, person1, "王添男" );
		lookPoker(hm, person2, "王亚楠" );
		lookPoker(hm, person3, "王佳乐" );
		lookPoker(hm, dipai,   "公   共" );
	}

	public static void lookPoker(HashMap<Integer, String> hm ,TreeSet<Integer> ts ,String name) {
		System.out.print(name + "的牌是：");
		for (Integer i : ts) {							//i代表的是双列集合的每一个键
			System.out.print( hm.get(i) + " ");		//hm.get根据键获取值
		}
		System.out.println();
		
		
		
		
	}
}
