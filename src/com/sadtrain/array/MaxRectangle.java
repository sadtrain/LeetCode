package com.sadtrain.array;

/**
 * @Description :
 * @Author : ZGS
 * @Date: 2021-06-27 19:13
 */
public class MaxRectangle {
    public int largestRectangleArea(int[] heights) {

        int l = 0;
        int r = heights.length -1;
        int max = 0;
        while(l<r){
            if(heights[l]<heights[r]){
                max = (r-l+1)*heights[r];
                l++;
            }else{
                max = (r-l+1)*heights[l];
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,5,6,2,3};
        MaxRectangle maxRectangle = new MaxRectangle();
        int i = maxRectangle.largestRectangleArea(a);
        System.out.println(i);
    }
}
