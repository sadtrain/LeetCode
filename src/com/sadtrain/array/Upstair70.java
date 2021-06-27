package com.sadtrain.array;

/**
 * @Description :
 * @Author : ZGS
 * @Date: 2021-06-27 17:48
 */
public class Upstair70 {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int a1=1;
        int t = 2;
        for(int i=3;i<=n;i++){
            t=t+a1;
            a1=t;
        }
        return t;
    }

    public static void main(String[] args) {
        Upstair70 upstair70 = new Upstair70();
        System.out.println(upstair70.climbStairs(4));;

    }
}
