package com.hehe.mathutil.core;

import org.junit.jupiter.api.Test;

// IMPORT STATIC LÀ CÁCH KHAI BÁO TRƯỚC TÊN CLASS CHỨA HÀM STATIC
// ĐỂ Ở DỨƠI GỌI HÀM STATIC NGẮN GỌN NHƯ BÊN PASCAL, C: GỌI HÀM KO CẦN DẤU CHẤM TÊN CLASS
// NẾU CÓ NHIỀU HÀM STATIC, THÌ TA CHỈ CẦN IMPORT STATIC TÊN CLASS.*
import static com.hehe.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //CLASS NÀY XÀI BỘ THƯ VIỆN JUNIT, ĐC TẢI TRÊN MẠNG VỀ TỰ DỘNG BỞI MAVEN.
    //BỘ THƯ VIỆN JUNIT NÀY DÙNG ĐỂ TEST TỰ ĐỘNG CÁC HÀM CỦA CLASS CHÍNH
    //NÓ SẼ TỰ CHẠY KHI ĐÓNG GÓI APP, ĐỂ CHECK XEM CÁC HÀM CÓ CHẠY ĐÚNG KO
    //ĐÚNG TỨC LÀ EXPECTED == ACTUAL
    // NẾU CÓ NHIỀU TEST CASE, THÌ NÓ SẼ GÔM STATUS CỦA CÁC TEST CASE LẠI THÀNH 2 MÀU XANH - PASSED ĐỎ - FAILED MÀ KO
    // CẦN NHÌN TỪNG TEST CASE COI PASSED HAY FAILED Y CHANG CHO CÁC NGÔN NGỮ LẬP TRÌNH KHÁC - LÀ CHUẨN TEST CODE R


    //TESTCASE #4:

    @Test
    public void testFactorialGivenRightAgrument5ReturnsWell(){
        assertEquals(120, getFactorial(5));
        //                  5! hy vọng trả về 120
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }

    //TESTCASE #3:

    @Test
    public void testFactorialGivenRightAgrument4ReturnsWell(){
        assertEquals(24, getFactorial(4));
        //                  4! hy vọng trả về 24
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }
    //TESTCASE #2:

    @Test
    public void testFactorialGivenRightAgrument1ReturnsWell(){
        assertEquals(1, getFactorial(1));
        //                  1! hy vọng trả về 1
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }



    //TESTCASE #1:

    @Test
    public void testFactorialGivenRightAgrument0ReturnsWell(){
        int n = 0;                         // 0!
        long expectedResult = 1;        // hy vọng trả về 1
        long actualResult = getFactorial(n);        // thực tế sẽ là mấy

        // di so sánh 2 giá trị coi expected == actual???
//        System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult);  // true/ false

        assertEquals(expectedResult,actualResult);
        // so sánh xem 2 đứa có bằng nhau k expected == actual ko??? nhưng ko viết sout()
        // hàm này của class thư viện Junit
    }
}