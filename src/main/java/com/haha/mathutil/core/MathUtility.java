package com.haha.mathutil.core;

public class MathUtility {
    //class này cung cấp các hàm liên quan đến toán học
    //nó là thư viện toán học. Mà thư viên tính toán thì các hàm sẽ là static
    //hàm tính n!
    //n! = 1.2.3...n, trong đó
    //0! = 1! = 1
    //mình không tính quá 20! vì 21! kiểu long chứa không nổi, sẽ tính sai
    //mình chỉ tính từ 0...20!
    //hàm nhận vào n, trả về n! (n trong đoạn từ [0..20])
//    public static long getFactoraial(int n) {
//        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
//        //kĩ thuật nhân dồn, cộng dồn giá trị
//
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be in the range [0...20]");
//        long result = 1; // bai tong thi ban dau = 0
//        if (n == 0)
//            return 1; // thoat som khi co the
//        //if va for neu chi co 1 lenh ko can {1 lenh}
//        //return som thi ko can else luon
//
//        // n= 1 2 3 4 -> nhan don vao result = result * i
//        for (int i = 1; i <= n; i++) {
//            //result = result * i
//            result *= i; //nhan don tu 1 den n, i tang tu 1 2 3, don vao result
//        }
//        return result;
//    }
    public static long getFactoraial(int n) {
        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        //kĩ thuật nhân dồn, cộng dồn giá trị

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be in the range [0...20]");
        }
        if (n == 0 || n == 1)
            return 1; // thoat som khi co the
        return n * getFactoraial(n - 1);// xong de quy
    }
    // 5! = 1.2.3.4.5
    //    = 4!x5 tinh ruot duoi
    //4!  = 3!x4
    //3!  = 2!x3
    //2!  = 1!x2
    //1!  = 1
    //de quy - recursion
    // goi lai chinh minh voi quy mo nho hon - bup be nga
    //n! = nx(n-1)
}


