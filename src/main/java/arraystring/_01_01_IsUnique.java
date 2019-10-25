package arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    boolean isUnique(String str) {
    	int[] arr = new int[256];
    	for (int i=0; i<str.length(); i++) {
    		arr[(int) str.charAt(i)]++;
    	}
    	for (int i : arr) if (i>1) return false;
    	return true;
    }

}
