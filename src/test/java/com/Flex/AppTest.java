package com.Flex;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testSum() {
		int result;
		result = App.sum(1,1);
		assertEquals(2,result);
		System.out.println("Test sum 1+1 passed");
	}
	@Test
	public void testDiff() {
		int result = App.diff(2,1);
		assertEquals(1,result);
		System.out.println("Test diff 2-1 passed");
	}
	@Test
	public void testConsonant() {
		int result = Consonants.Consonant("Hello");
		assertEquals(3,result);
		System.out.println("Test for consonants passed");
	}
	@Test
	public void testLastLetterCount() {
		String test = "Why is it so easy to implement the consonants codes.";
		int [] result = {3,2};
		int [] ans = LastLetterCount.countWords(test);
		Assert.assertArrayEquals(result, ans);
		System.out.println("Test for countWords passed");
	}
	@Test
	public void testswitchWords() {
		String test = "He's crazy.";
		String ans = LastLetterCount.switchWords(test);
		String comp = "Crazy he's.";
		assertEquals(comp,ans);
		System.out.println("Test for switchWords passed");
	}
	@Test
	public void testPalindrome() {
		String test = "Kanak";
		boolean ans = Palindrome.palindrome(test);
		assertEquals(true,ans);
		System.out.println("Test for palindrome passed");
	}
	@Test
	public void testVowels() {
		String test = "Hello how are you?";
		int ans = Vowels.countVowels(test);
		assertEquals(7,ans);
		System.out.println("Test for counting vowels passed");
	}
	@Test
	public void testCount() {
		String test = "How many words in this string?";
		int ans = Count.wordCount(test);
		assertEquals(6,ans);
		System.out.println("Test for counting words passed");
	}

}
