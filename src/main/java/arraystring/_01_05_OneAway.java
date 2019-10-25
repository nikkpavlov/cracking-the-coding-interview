package arraystring;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
class _01_05_OneAway {
    boolean isOneAway(String a, String b) {
        if (Math.abs(a.length()-b.length()) > 1) return false;
        int i1 = 0;
        int i2 = 0;
        boolean oneDiff = false;
        while (i1 < a.length() && i2 < b.length()) {
        	if (a.charAt(i1) == b.charAt(i2)) oneDiff = oneDiff;
        	else {
        		if (oneDiff) return false;
        		else {
        			if (a.length() == b.length()) oneDiff = true;
        			else {
        				if (a.length() >= b.length()) i2--;
        				else i1--;
        			}
        		}
        	}
        	i1++;
        	i2++;
        	
        }
        return true;
    }

}
