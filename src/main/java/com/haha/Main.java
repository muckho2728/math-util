package com.haha;

import com.haha.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            testFactorialGivenRightAgrument0ReturnsWel();
            testFactorialGivenRightAgrument1ReturnsWel();
            testFactorialGivenRightAgrument5ReturnsWel();
            testFactorialGivenWrongAgrumentMinus1ThrowsException();
    }

    public static void testFactorialGivenWrongAgrumentMinus1ThrowsException() {
        MathUtility.getFactoraial(-1);
        //chay ham nay, thay ngoai le bung ra, mung rot nuoc mat
        //vi dua -1 ma ham nem ngoai le nghia la ham chay dung do data ca chon
        //ham duoc thiet ke la n am thi nem ngoai le
        //vay gio neu dua -1 ma nem ngoai le -> ham oke
    }

        //hàm kiểm thử code chính của mình, hàm này dân dev dùng để test code chính,
        //chính là hàm getFactorial() bên .core
        //Tên hàm kiểm thử luôn mang ý nghĩa của test case
        //Ví dụ dưới này: cho tham số tử tế RightArg 0 thì hàm phải chạy ngon run well

        public static void testFactorialGivenRightAgrument0ReturnsWel(){
            int n = 0;                      //0!
            long epectedResult = 1;         //hy vongj trả về 1
            long actualResult = MathUtility.getFactoraial(n);// thực tế là mấy

            //đi so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: "+actualResult+" Actual: "+epectedResult);
            System.out.println(epectedResult == actualResult);// true /false
        }

        public static void testFactorialGivenRightAgrument1ReturnsWel(){
            int n = 1;                      //0!
            long epectedResult = 1;         //hy vongj trả về 1
            long actualResult = MathUtility.getFactoraial(n);// thực tế là mấy

            //đi so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: "+actualResult+" Actual: "+epectedResult);
            System.out.println(epectedResult == actualResult);// true /false
        }

        public static void testFactorialGivenRightAgrument5ReturnsWel(){
            int n = 5;                      //0!
            long epectedResult = 120;         //hy vongj trả về 1
            long actualResult = MathUtility.getFactoraial(n);// thực tế là mấy

            //đi so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: "+actualResult+" Actual: "+epectedResult);
            System.out.println(epectedResult == actualResult);// true /false
        }

        //dân dev phải test code của chính họ
        //họ test code của họ như thế nào?
        //trước khi test(test run) thì cần có test case
        //test case #1
        //check getfactorial() with n = 0
        //steps:
        //(1) given n = 0;
        //(2)call getfactorial(0)
        //epected result/value: 1

        //test case #2
        //check getfactorial() with n = 1
        //steps:
        //(1) given n = 1;
        //(2)call getfactorial(1)
        //epected result/value: 1

        //test case #3
        //check getfactorial() with n = 5
        //steps:
        //(1) given n = 5;
        //(2)call getfactorial(5)
        //epected result/value: 120

        //test case #4
        //check getfactorial() with n = -1
        //steps:
        //(1) given n = -1;
        //(2)call getfactorial(-1)
        //epected result/value: an exception is thrown

        //test case #5
        //check getfactorial() with n = 21
        //steps:
        //(1) given n = 21;
        //(2)call getfactorial(21)
        //epected result/value: an exception is thrown
    }
