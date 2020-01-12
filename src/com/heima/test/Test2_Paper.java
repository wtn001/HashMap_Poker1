package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2_Paper {
	/*需求：模拟斗地主洗牌发牌，牌没有顺序
	 * 分析：
	 * 1洗牌前提是需要有扑克牌，需要定义一个集合放置扑克牌
	 * 2洗牌
	 * 3发牌
	 * 4看牌
	 * 
	 * */

	public static void main(String[] args) {
	//1洗牌前提是需要有扑克牌，需要定义一个集合放置扑克牌
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"红桃","黑桃","方片","梅花"};
		//所有的牌放置在集合中
		ArrayList<String> poker = new ArrayList<>();
		//拼接花色和数字
		for (String s1 : color) {				//拿花色
			for (String s2 : num) { 			//拿数字
				poker.add(s1.concat(s2));       //concat表示的是连接两个字符串	
			}
		}
		poker.add("大王");
		poker.add("小王");
	//2洗牌
		Collections.shuffle(poker);
		
	//3发牌(就三个人，做三个集合，接收扑克牌就可以了)
		ArrayList<String> person1 = new ArrayList<>();
		ArrayList<String> person2 = new ArrayList<>();
		ArrayList<String> person3 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		
		for (int i = 0; i < poker.size(); i++) {
			if( i >= poker.size() - 3) {				//将三张底牌存在底牌的集合中
				dipai.add(poker.get(i));
			}else if ( i % 3 == 0) {					//0 3 6 9……的索引位置的牌给person1 
				person1.add(poker.get(i));
			}else if ( i % 3 == 1) {					//1 4 7 10……的索引位置的牌给person2 
				person2.add(poker.get(i));
			}else {										//剩下的牌给person3
				person3.add(poker.get(i));
			}
		}
	//4看牌
		System.out.println("person1的牌:"+person1);
		System.out.println("person2的牌:"+person2);
		System.out.println("person3的牌:"+person3);
		System.out.println("底                 牌:"+dipai);
	}
}
