package Stuti.codes;

import org.junit.jupiter.api.*;

class MyBeforeAfterTest {

    @BeforeAll  // we use static in method bcz it is class level method
   static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }

    @AfterAll //// we use static in method bcz it is class level method
    static void AfterAll(){
        System.out.println("AfterAll");
    }

}