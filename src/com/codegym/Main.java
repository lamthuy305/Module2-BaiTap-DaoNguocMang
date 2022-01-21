package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[] { 1,2,3,4,5,6,10,20,30,40,50,60,70};
        Stack<Integer> stack = new Stack<>();

        System.out.print("Mảng ban đầu: ");
        for (int e: arr){
            System.out.printf("%d\t", e);
        }

        for (int e: arr){
            stack.push(e);
        }
        for (int i = 0; i< arr.length; i++){
            arr[i] = stack.pop();
        }

        System.out.print("\nMảng đảo ngược: ");
        for (int e: arr){
            System.out.printf("%d\t", e);
        }
    }
}
