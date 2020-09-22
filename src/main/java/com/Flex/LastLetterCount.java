package com.Flex;

import java.util.*;


public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				int [] ans=countWords(str);
				String ans1 = switchWords(str);
				System.out.println(ans1);
			}
			public static int [] countWords(String str) {
				if(str.isEmpty()) System.out.println("Invalid Input");
				int i = 0;
				int [] ans = new int [2]; 
				int sCounter = 0;
				int yCounter = 0;
				str = str.trim().toLowerCase().replaceAll("[^a-z0-9 ]","");
				int n = str.length();
				while(i<n) {
					while(i<n && str.charAt(i)==' ') i++;
					if(i>=n) break;
					int j = i+1;
					while(j<n && str.charAt(j)!=' ') j++;
					if(str.charAt(j-1)=='s') {
						sCounter++;
					}
					if(str.charAt(j-1)=='y') {
						yCounter++;
					}
					i = j+1;
					
				}
				ans[0] = sCounter;
				ans[1] = yCounter;
				
				System.out.println("Number of words ending in s:"+sCounter);
				System.out.println("Number of words ending in y:"+yCounter);
				return ans;
				
			}
			public static String switchWords(String str) {
				if(str.isEmpty()) return null;
				str = str.trim().toLowerCase().replaceAll("[^a-z0-9' ]","");
				ArrayList<String> list = new ArrayList<>();
				String ans = new String();
				boolean s = true;
				boolean y = true;
				int sIndex = -1;
				int yIndex = -1;
				String[] words = str.split("\\s+");
				int n = words.length;
				for(int i=0;i<n;i++){
					list.add(words[i]);
				}
				//System.out.println(list);
				for(int j=0;j<list.size();j++) {
					String word = list.get(j);
					int l = word.length();
					for(int k=0;k<l;k++) {
						if(word.charAt(l-1)=='s'&& s) {
							sIndex = j;
							//System.out.println(sIndex);
							s = false;
						}
						if(word.charAt(l-1)=='y'&& y) {
							yIndex = j;
							//System.out.println(yIndex);
							y = false;
						}
					}
				}
				if(sIndex!= -1 && yIndex!= -1) {
					Collections.swap(list,sIndex,yIndex);
				}
				for(String c : list) {
					if(ans.length()==0) {
						ans = c;
					}else {
						ans = ans + " " + c;
					}
				}
			   String ans1 = ans.substring(0,1).toUpperCase();
			   String Finalans = ans1 + ans.substring(1)+"."; 
			   return Finalans;	
			
			}	
	

}
