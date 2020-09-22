package com.Flex;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = wordCount(str);
		System.out.println(ans);

	}
	public static int wordCount(String str) {
		if(str.isEmpty()) return 0;
		str = str.trim();
		int i = 0;
		int n = str.length();
		int count = 0;
		while(i<n) {
			while(i<n && str.charAt(i)==' ') i++;
			if(i>=n) break;
			int j = i+1;
			while(j<n && str.charAt(j)!=' ') j++;
			count++;
			i = j+1;
		}
		return count;
		
	}
	

}
