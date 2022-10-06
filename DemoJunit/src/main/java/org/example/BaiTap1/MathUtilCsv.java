package org.example.BaiTap1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilCsv {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test(int a, int b, int result){
        MathUttil math = new MathUttil();
        assertEquals(math.sum(a, b), result);
    }
}
