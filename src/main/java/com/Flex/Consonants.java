package com.Flex;

import java.util.*;

public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = Consonant(str);
		System.out.println(ans);

	}
	public static int Consonant(String str) {
		if(str.isEmpty()) return 0;
		String replaced = new String();	
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9 ]","");
		int count = 0;
		for(char c : str.toCharArray()) {
			if(c!='a' && c!='e'&& c!='i'&& c!='o' && c!='u'&& c!=' ') {
				count++;
				c = '*';
			}
			replaced += c;
		}
		System.out.println(replaced);
		return count;
	 }

}
