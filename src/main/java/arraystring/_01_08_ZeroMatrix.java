package arraystring;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
class _01_08_ZeroMatrix {
    int[][] zero(int[][] matrix) {
    	System.out.println(Arrays.deepToString(matrix));
    	if (matrix[0].length == 0) return matrix;
    	ArrayList<Integer> rows = new ArrayList<>();
    	ArrayList<Integer> cols = new ArrayList<>();
    	for (int i=0; i<matrix.length; i++) {
    		for (int j=0; j<matrix.length; j++) {
    			if (matrix[i][j] == 0) {
    				rows.add(i); cols.add(j);
    			}
    		}
    	}
    	for (int row : rows) {
    		for (int j=0; j<matrix[0].length; j++) matrix[row][j] = 0;
    	}
    	for (int col : cols) {
    		for (int i=0; i<matrix.length; i++) matrix[i][col] = 0;
    	}
    	//System.out.println(Arrays.deepToString(matrix));
    	return matrix;
    }
}
