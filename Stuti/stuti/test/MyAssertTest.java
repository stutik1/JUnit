package Stuti.stuti.test;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertsTest {

    List<String> course = Arrays.asList("Java", "H2", "Spring");

    @Test
    void test(){
        boolean test = course.contains("Java");
        boolean test2 = course.contains("java");
      // assertEquals(true,test);
       assertTrue(test);
       assertFalse(test2);
       assertArrayEquals(new int[] {1,2}, new int[]{1,2});
       assertEquals(3, course.size(),"Something went wrong");
    }

}