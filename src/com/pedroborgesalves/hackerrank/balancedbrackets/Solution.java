package com.pedroborgesalves.hackerrank.balancedbrackets;

import java.util.*;


/**
 * Solution for https://www.hackerrank.com/challenges/ctci-balanced-brackets
 * @author pedroborgesalves
 */


public class Solution {
    
    public static boolean isBalanced(String expression) {
        
        Stack<Character> stack = new Stack();
        
        if(expression.length() % 2 != 0){
            return false;
        }
        
        for(int i = 0; i < expression.length(); i++){
            
            switch(expression.charAt(i)){
                case '{':
                    stack.push('}'); break;
                case '(':
                    stack.push(')'); break;
                case '[':
                    stack.push(']'); break;
                default:
                    if(stack.empty() || expression.charAt(i) != stack.peek()){
                        return false;
                    }
                    stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
    
}
