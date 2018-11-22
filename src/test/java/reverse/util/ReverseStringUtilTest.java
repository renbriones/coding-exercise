package reverse.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringUtilTest {

	@Test
	public void reverseString_NonEmptyNonNullString()
	{
		String word = "apple";
		String reversedWord = ReverseStringUtil.reverseString(word);
		Assert.assertEquals("elppa", reversedWord);
	}
	
	@Test
	public void reverseString_EmptyString()
	{
		String word = "";
		String reversedWord = ReverseStringUtil.reverseString(word);
		Assert.assertEquals("", reversedWord);
		
		word = " ";
		reversedWord = ReverseStringUtil.reverseString(word);
		Assert.assertEquals(" ", reversedWord);
	}
	
	@Test
	public void reverseString_NullString()
	{
		String word = null;
		String reversedWord = ReverseStringUtil.reverseString(word);
		Assert.assertEquals("", reversedWord);
	}
	
	@Test
	public void reverseString_NonEmptyNonNullList()
	{
		List<String> wordList = Arrays.asList("apple", "mango", "banana"); 
		List<String> reversedWordList = ReverseStringUtil.reverseString(wordList);
		Assert.assertNotNull(reversedWordList);
		Assert.assertEquals(3, reversedWordList.size());
		Assert.assertEquals("elppa", reversedWordList.get(0));
		Assert.assertEquals("ognam", reversedWordList.get(1));
		Assert.assertEquals("ananab", reversedWordList.get(2));
	}
	
	@Test
	public void reverseString_EmptyList()
	{
		List<String> wordList = new ArrayList<String>(); 
		List<String> reversedWordList = ReverseStringUtil.reverseString(wordList);
		Assert.assertNotNull(reversedWordList);
		Assert.assertEquals(0, reversedWordList.size());
	}
	
	@Test
	public void reverseString_NullList()
	{
		List<String> wordList = null; 
		List<String> reversedWordList = ReverseStringUtil.reverseString(wordList);
		Assert.assertNotNull(reversedWordList);
		Assert.assertEquals(0, reversedWordList.size());
	}
	
	@Test
	public void filterPalindrome_NonEmptyNonNullList()
	{
		List<String> wordList = Arrays.asList("apple", "radar", "banana"); 
		List<String> palidromeWordList = ReverseStringUtil.filterPalindrome(wordList);
		Assert.assertNotNull(palidromeWordList);
		Assert.assertEquals(1, palidromeWordList.size());
		Assert.assertEquals("radar", palidromeWordList.get(0));		
	}
	
	@Test
	public void filterPalindrome_EmptyList()
	{
		List<String> wordList = new ArrayList<String>(); 
		List<String> palidromeWordList = ReverseStringUtil.filterPalindrome(wordList);
		Assert.assertNotNull(palidromeWordList);
		Assert.assertEquals(0, palidromeWordList.size());
	}
	
	@Test
	public void filterPalindrome_NullList()
	{
		List<String> wordList = null; 
		List<String> palidromeWordList = ReverseStringUtil.filterPalindrome(wordList);
		Assert.assertNotNull(palidromeWordList);
		Assert.assertEquals(0, palidromeWordList.size());
	}
}
