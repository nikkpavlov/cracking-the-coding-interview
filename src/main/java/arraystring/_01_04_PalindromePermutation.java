package arraystring;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
    	s.toLowerCase();
    	int[]  arr =new int[256];
    	for (int i = 0; i<s.length(); i++) {
    		if ((int) 'a' <= s.charAt(i) && s.charAt(i) <= (int) 'z') arr[(int) s.charAt(i)]++;
    	}
    	boolean undivisibleByTwo = false;
    	for (int val : arr) {
    		if (val%2 == 0) continue;
    		else {
    			if (!undivisibleByTwo) undivisibleByTwo = true;
    			else return false;
    		}
    	}
        return true;
    }
}
