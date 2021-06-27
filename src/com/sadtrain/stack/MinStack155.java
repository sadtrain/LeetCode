package com.sadtrain.stack;

import java.util.Stack;

/**
 * @Description :
 * @Author : ZGS
 * @Date: 2021-06-27 18:24
 */
public class MinStack155 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack155() {
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.empty()){
            minStack.push(val);
            return;
        }
        if(val<minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
