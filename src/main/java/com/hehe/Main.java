package com.hehe;

import com.hehe.mathutil.core.MathUtility;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            testFactorialGivenRightAgrument0ReturnsWell();
            testFactorialGivenRightAgrument1ReturnsWell();
            testFactorialGivenRightAgrument5ReturnsWell();
            testFactorialGivenRightAgrumentMinus1ThrowsException();
        }

        public static void testFactorialGivenRightAgrumentMinus1ThrowsException(){
            MathUtility.getFactorial(-1);
            // chạy hàm này, thấy ngoại lệ bung ra, mừng rơi nước mắt


        }
        // hàm kiểm thử code chính của mình, hàm này dân dev dùng để test code chính, code chính chính là hàm getFactorial
        //

        public static void testFactorialGivenRightAgrument0ReturnsWell(){
            int n = 0;                         // 0!
            long expectedResult = 1;        // hy vọng trả về 1
            long actualResult = MathUtility.getFactorial(n);        // thực tế sẽ là mấy

            // di so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
            System.out.println(expectedResult == actualResult);  // true/ false
        }

        public static void testFactorialGivenRightAgrument1ReturnsWell(){
            int n = 1;                         // 0!
            long expectedResult = 1;        // hy vọng trả về 1
            long actualResult = MathUtility.getFactorial(n);        // thực tế sẽ là mấy

            // di so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
            System.out.println(expectedResult == actualResult);  // true/ false
        }

        public static void testFactorialGivenRightAgrument5ReturnsWell(){
            int n = 5;                         // 0!
            long expectedResult = 120;        // hy vọng trả về 1
            long actualResult = MathUtility.getFactorial(n);        // thực tế sẽ là mấy

            // di so sánh 2 giá trị coi expected == actual???
            System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
            System.out.println(expectedResult == actualResult);  // true/ false
        }

        // Dân dev phải test code của chính họ
        // họ phải test code của họ như thế nào
        // trước khi test (test run) thì cần phải có test case

        // test case #1
        // check getFactorial() with n = 0
        // steps:
        // (1) given n = 0
        // n = 0; call getFactorial(0)
        // expected result/ value :1

        // test case #2
        // check getFactorial() with n = 1
        // steps:
        // (1) given n = 0
        // n = 1; call getFactorial(1)
        // expected result/ value :1

        // test case #3
        // check getFactorial() with n = 5
        // steps:
        // (1) given n = 0
        // (2) n = 5; call getFactorial(0)
        // expected result/ value :120

        // test case #4
        // check getFactorial() with n = -1
        // steps:
        //(1) given n = -1
        //(2) call getFactorial(-1)
        // expected result/ value : an expected is thrown

        // test case #5
        // check getFactorial() with n = 21
        // steps:
        //(1) given n = 21
        //(2) call getFactorial(21)
        // expected result/ value : an expected is thrown


}