package com.Flex;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//Variable ans stores the number of vowels in the sentence 
		int ans = countVowels(str);
		System.out.println("The number of vowels are :"+ans);
	}
	public static int countVowels(String str) {
		if(str.isEmpty()) return 0;
		int n = str.length();
		str = str.toLowerCase();
		int count = 0;
		for(int i=0;i<n;i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			count++;
		}
		}
		return count;
	}
	

}
