package com.haha.mathutil.core;

import org.junit.jupiter.api.Test;
//IMPORT STATIC LÀ CÁCH KHAI BÁO TRƯỚC TÊN CLASS CHƯÁ HÀM STATIC
//ĐỂ Ở DƯỚI GỌI HÀM STATIC NGẮN GỌN NHƯ BÊN PASCAL, C: GỌI HÀM KO CẦN DẤU CHẤM TÊN CLASS
//NẾU CÓ NHIỀU HÀM STATIC, TA CHỈ CẦN IMPORT STATIC TÊN CLASS.*
import static com.haha.mathutil.core.MathUtility.getFactoraial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //class này xài bộ thư viện juint được tải trên mạng về bới maven
    //bộ thư viện juint này được dùng để test tự động các hàm class chính
    //nó sẽ tự động chạy khi đóng gói app, để check xem các hàm chạy có đúng không
    //đúng tức là expected == actual
    //nếu có nhiều test case, thì nó sẽ gom status của các test case lại thành hai màu xanh đỏ
    //mắt dân dev chỉ cần nhìn 2 màu xanh - passed
    //đỏ - failed mà không cần nhìn từng test case coi passed hay failed
    //y chang cho các ngôn ngữ lập trình khác - là chuẩn test code rồi
    //bộ thư viện này còn gọi là framework, junit testing framework

    //Test case #1: verify getfactorial with n = 0, expected 0! = 1
    @Test
    public void testFactorialGivenRightAgrument0ReturnsWel(){
        int n = 0;                      //0!
        long epectedResult = 1;         //hy vongj trả về 1
        long actualResult = getFactoraial(n);// thực tế là mấy

//        //đi so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: "+actualResult+" Actual: "+epectedResult);
//        System.out.println(epectedResult == actualResult);// true /false
        assertEquals(epectedResult, actualResult);
        //so sánh 2 đứa expected == actual ko?? nhưng ko viêts sout()
        //hàm này của class thư viện juint
    }
    //TEST CASE #2:
    @Test
    public void testFactorialGivenRightAgrument1ReturnsWel(){
//        int n = 0;                      //0!
//        long epectedResult = 1;         //hy vongj trả về 1
//        long actualResult = getFactoraial(n);// thực tế là mấy

//        //đi so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: "+actualResult+" Actual: "+epectedResult);
//        System.out.println(epectedResult == actualResult);// true /false
        assertEquals(1, getFactoraial(1));
        //                              1! hy vọng trả về 1
        // assert là hàm so 2 giá trị có == nhau hay ko nhu thư viện junit

    }
    //test case #3: 5!
    @Test
    public void testFactorialGivenRightAgrument5ReturnsWel(){

        assertEquals(120, getFactoraial(5));
        //                              5! hy vọng trả về 120
        // assert là hàm so 2 giá trị có == nhau hay ko nhu thư viện junit

    }
    //test case #4: 4!
    @Test
    public void testFactorialGivenRightAgrument4ReturnsWel(){

        assertEquals(24, getFactoraial(4));
        //                              4! hy vọng trả về 24
        // assert là hàm so 2 giá trị có == nhau hay ko nhu thư viện junit

    }

}