/*在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
注意:
n 是正数且在32为整形范围内 ( n < 231)。

示例 1:
输入:
3
输出:
3

示例 2:
输入:
11
输出:
0
说明:
第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。*/
package lianxi0505;

public class test0505 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 50;
        int a = s.findNthDigit(n);
        System.out.println(a);
    }
}

class Solution {
    public int findNthDigit(int n) {
        int i=0;
        int res=0;
        int temp=n;
        //判断n为几位数字
        while(temp > 9*Math.pow(10,i)*(i+1)){//i+1位共有多少个数字
            temp -= 9*Math.pow(10,i)*(i+1);
            i++;
        }

        for(int j=0;j<i;j++){
            res += 9*Math.pow(10,j);
        }
        res += temp/(i+1);//得到数字
        if(temp%(i+1)==0)
            return Integer.parseInt((res+"").charAt(i)+"");
        else
            return Integer.parseInt(((res+1)+"").charAt(temp%(i+1)-1)+"");
    }
}
