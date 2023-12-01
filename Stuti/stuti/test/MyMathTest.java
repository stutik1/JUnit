package Stuti.stuti.test;

import Stuti.codes.MyMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    void calculateSum_threeArray() {
        Assertions.assertEquals(6, math.sum(new int[]{1,2,3}));
    }

    @Test
    void test1() {
        int[] arr = {};
        int result = math.sum(arr);
        System.out.println(result);
        int expectedOutput = 0;
        assertEquals(expectedOutput,result);
    }

    @Test
    void test2() {
        int[] arr = {1,9};
        int result = math.sum(arr);
        System.out.println(result);
        int expectedOutput = 10;
        assertEquals(expectedOutput,result);
    }
}