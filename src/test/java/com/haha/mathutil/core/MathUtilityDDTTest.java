package com.haha.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.haha.mathutil.core.MathUtility.getFactoraial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị bộ data, các cặp data x! kì vọng bằng mấy
    //chính là mảng 2 chiều
    //hàm này phải là public static để các hàm @Test mò vào lấy data để test run
    public static Object[][]initData(){
            return new Object[][]{
                    { 0, 1},    //0! hy vọng 1
                    { 1, 1},
                    { 2, 2},
                    { 3, 6},
                    { 4, 24},
                    { 5, 120}, //5! hy vọng 120
                    { 6, 7200},

            };
    }

    @ParameterizedTest
    @MethodSource("initData") //DDT-Data Driven Testing
    public void testFactorialGivenRightAgrumentReturnsWel(int n, long expectedResult )
    {

        assertEquals(expectedResult, getFactoraial(n));


    }


}