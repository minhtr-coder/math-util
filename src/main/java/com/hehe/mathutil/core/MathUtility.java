package com.hehe.mathutil.core;

public class MathUtility {

    //class này cung cấp các hàm liên quan toán học
    //nó là thư viện toán học. mà thu viện tính toán thì các hàm thường sẽ
    //là static
    //hàm tính n!
    //n! = 1.2.3...n, trong đó
    //0! = 1! = 1
    // mình không tính quá 20! vi 21! kiểu long chứa ko nổi, sẽ tính sai
    //mình chỉ tính từ 0...20!
    //hàm nhận vào n, trả về n!(n trong đoạn từ [0...20]
    public static long getFactorial(int n ) {
        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        // kĩ thuật nhân dồn, cộng dồn giá trị

        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be in the range [0...20]" );

        long result = 1; // bài tổng thì ban đầu = 0
        if (n == 0)
            return 1; // thoát sớm khi có thể, return ngay khi có thể
        // if và for nếu chỉ có 1 lện thì ko cần {... 1 lệnh}
        // return sớm thì không cần else luôn

        // n = 1 2 3 4 -> nhân dồn vào result = result * 1
        for (int i = 1; i <= n ; i++) {
            // result = result * i
            result *= i; // nhân dồn từ 1 đến n, i tăng từ 1 2 3, dồn vào result

        }
        return result;
    }
}
