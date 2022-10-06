package org.example.BaiTap1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUlitTest {
    MathUttil math = new MathUttil();
    @Test
    public void test1(){
        assertEquals(math.sum(1, 2), 3);
    }

    @Test
    public void test2(){
        assertEquals(math.sum(1, 3), 4);
    }
    @Test
    public void test3(){
        assertEquals(math.sum(2, 3), 5);
    }


}
