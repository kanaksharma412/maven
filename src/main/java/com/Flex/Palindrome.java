package com.Flex;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean ans = palindrome(str);
		System.out.println(ans);

	}
	public static boolean palindrome(String str) {
		if(str.isEmpty()) return false;
		str = str.toLowerCase();
		str = str.replaceAll("[^A-Za-z0-9]","");
		int n = str.length();
		char [] temp = str.toCharArray();
		int s = 0, e = n-1;
		while(s<=e) {
			char t = temp[s];
			temp[s] = temp[e];
			temp[e] = t;
			s++;
			e--;
		}
		String palindrome = new String();
		for(char c : temp) {
			palindrome += c;
		}
		System.out.println(palindrome);
		if(str.equals(palindrome)) {
			return true;
		}
		return false;
	}
	

}
