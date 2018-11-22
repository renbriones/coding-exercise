
package reverse.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reverse.util.ReverseStringUtil;

@RestController
public class ReverseController {


	/**
	 * As a user I want to reverse the order of letters in a set of words so that I see a list of backwards words.
	 */
	@RequestMapping(value="/reverse", method=RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> reverseString(@RequestBody final List<String> words)
	{
		return ReverseStringUtil.reverseString(words);		
	}
		
		
	/**
	 * As a user I want to check if a word on a my list is a palindrome so that I see a list of palindrome words
	 * A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
	 */
	@RequestMapping(value="/palindrome", method=RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> checkPalindrome(@RequestBody final List<String> words)
	{
		return ReverseStringUtil.filterPalindrome(words);		
	}
	
	
	/**
	 * As a user I want to filter my list so that I see a list of words that starts with ‘a’ and has 5 letters in it 
	 */
	@RequestMapping(value="/filter", method=RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> filter(@RequestBody final List<String> words,
										@RequestParam final int maxWordSize,
										@RequestParam final String wordStartsWith)
	{
		
		
		return ReverseStringUtil.filter(words, maxWordSize, wordStartsWith);		
	}
	
}
