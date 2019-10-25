package arraystring;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class _01_07_RotateMatrixTest {

    private _01_07_RotateMatrix s = new _01_07_RotateMatrix();

    @Test
    public void withOneOne() {
        assertTrue(Arrays.deepEquals(new int[][]{{1}}, s.rotate(new int[][]{{1}})));
    }

    @Test
    public void withTwoTwo() {
        assertTrue(Arrays.deepEquals(new int[][]{
                        {3, 1},
                        {4, 2}},
                s.rotate(new int[][]{
                        {1, 2},
                        {3, 4}})));
    }

    @Test
    public void withThreeThree() {
        assertTrue(Arrays.deepEquals(new int[][]{
                        {7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}
                },
                s.rotate(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}})));
    }
    @Test
    public void withSix() {
    	assertTrue(Arrays.deepEquals(new int[][] {
    		{31,25,19,13,7,1},
    		{32,26,20,14,8,2},
    		{33,27,21,15,9,3},
    		{34,28,22,16,10,4},
    		{35,29,23,17,11,5},
    		{36,30,24,18,12,6},
    		}, 
    		s.rotate(new int[][] {
    			{1,2,3,4,5,6},
    			{7,8,9,10,11,12},
    			{13,14,15,16,17,18},
    			{19,20,21,22,23,24},
    			{25,26,27,28,29,30},
    			{31,32,33,34,35,36}})));
    }
}