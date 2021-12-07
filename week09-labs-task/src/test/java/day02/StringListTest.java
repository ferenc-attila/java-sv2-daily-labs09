package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    StringList stringList = new StringList();

    @Test
    void shortestWordsTest() {
        List<String> test = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(3, stringList.shortestWords(test).size());
        assertArrayEquals(new String[]{"aa", "bb", "dd"}, stringList.shortestWords(test).toArray());
    }

    void shortestWordEmptyStringTest() {
        List<String> test = Arrays.asList("aaa", "aa", "bb", "", "dd");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> stringList.shortestWords(test));
        assertEquals("Not a word!", iae.getMessage());
    }
}