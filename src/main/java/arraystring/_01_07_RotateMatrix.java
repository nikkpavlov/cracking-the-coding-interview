package arraystring;

import java.util.Arrays;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
class _01_07_RotateMatrix {
    int[][] rotate(int[][] m) {
    	if (m.length != m[0].length) throw new IllegalArgumentException();
        for (int i=0; i<m.length/2; i++) {
        	for (int j=i; j<(m.length-i-1); j++) {
        		int temp = m[i][j];
        		m[i][j] = m[m.length-j-1][i];
        		m[m.length-j-1][i] = m[m.length-i-1][m.length-j-1];
        		m[m.length-i-1][m.length-j-1] = m[j][m.length-i-1];
        		m[j][m.length-i-1] = temp;
 
        	}
        }
    	
    	System.out.println(Arrays.deepToString(m));
    	return m;
    }
}
