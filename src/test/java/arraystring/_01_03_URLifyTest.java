package arraystring;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _01_03_URLifyTest {

    private _01_03_URLify s = new _01_03_URLify();

    @Test
    public void withNoSpace() {
        assertArrayEquals("hello".toCharArray(), s.urlify("hello".toCharArray(), 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withInsufficientLength() {
        s.urlify("hello world ".toCharArray(), 11);
    }

    @Test
    public void withOneSpace() {
        assertArrayEquals("hello%20world".toCharArray(), s.urlify("hello world  ".toCharArray(), 11));
    }

    @Test
    public void withTwoSpaces() {
        assertArrayEquals("hello%20world%20bob".toCharArray(), s.urlify("hello world bob    ".toCharArray(), 15));
    }
    
    @Test
    public void twoSpaceNextToEachOther() {
    	String answer = "hello%20%20world";
    	String input = "hello  world    ";
    	assertArrayEquals(answer.toCharArray(), s.urlify(input.toCharArray(), input.length()));
    }
}