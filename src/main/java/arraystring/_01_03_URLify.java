package arraystring;

import java.util.Arrays;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {
        int iter = chars.length-1;
        int lastLetter = chars.length;
        for (int i=trueLength-1; i>=0; i--) {
        	if (chars[i] != ' ') {
        		lastLetter = i;
        		break;
        	}
        }
        while (iter>=0 && lastLetter>=0) {
        	if (chars[lastLetter] == ' ') {
        		chars[iter] = '0';
        		chars[iter-1] = '2';
        		chars[iter-2] = '%';
        		iter -= 2;
        	}
        	else {
        		chars[iter] = chars[lastLetter];
        	}
        	iter--;
        	lastLetter--;
        	
        }
        if (iter != -1 || lastLetter != -1) throw new IllegalArgumentException();
    	
    	System.out.println(Arrays.toString(chars));
    	return chars;
    }
}
