package com.Jspider.Demo;

import java.util.HashMap;

public class Number_of_words_By_Hashmap {

	public static void main(String[] args) {
		String str ="hi hello how r you hi";
		
		HashMap<String ,Integer> m= new HashMap<>();
		String [] words=str.split(" ");
		for(String word:words)
		{
			if(m.containsKey(word))
			{
				m.put(word, m.get(word)+1);
			}
			else {
				m.put(word, 1);
			}
		}
		System.out.println(m);

	}

}
