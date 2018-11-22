package reverse.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReverseStringUtil {

	/**
	 * Reverse the string
	 * @param word
	 * @return
	 */
	public static String reverseString(String word)
	{
		word = Optional.ofNullable(word).orElse("");
				
		StringBuilder wordSB = new StringBuilder(word);
		
		return wordSB.reverse().toString();
	}

	/**
	 * Reverse all string in a List
	 * 
	 * @param words
	 * @return
	 */
	public static List<String> reverseString(List<String> words)
	{
		words = Optional.ofNullable(words).orElse(new ArrayList<String>());
		
		List<String> reverseList = new ArrayList<>();
		
		words.stream()
			.forEach(e -> reverseList.add(ReverseStringUtil.reverseString(e)));
		
		return reverseList;
	}
	
	/**
	 * Get a list of palindrome
	 * 
	 * @param words
	 * @return
	 */
	public static List<String> filterPalindrome(List<String> words)
	{
		words = Optional.ofNullable(words).orElse(new ArrayList<String>());
		
		List<String> reverseList = new ArrayList<>();
		
		words.stream()
			.forEach(e -> reverseList.add(ReverseStringUtil.reverseString(e)));

		return words.stream()
					 .filter(e -> reverseList.contains(e))
					 .collect(Collectors.toList()); 
	}
	
	/**
	 * Filter list of words
	 * @param words
	 * @param maxWordSize
	 * @param wordStartsWith
	 * @return
	 */
	public static List<String> filter(List<String> words, int maxWordSize, String wordStartsWith)
	{
		return words.stream()
			.filter(e -> e.length() <= maxWordSize)
			.filter(e -> e.startsWith(wordStartsWith))
			.collect(Collectors.toList());
	}
	
}
